from pyspark.sql import SparkSession
from pyspark.sql.types import DateType, DecimalType, IntegerType, StringType, StructType, StructField
from pyspark.sql.functions import *
from pyspark import SparkContext

spark = SparkSession.builder.master("local")\
                              .appName("Finance_Cleansing")\
                              .getOrCreate()

schema = StructType([\
StructField('id',IntegerType(),False),\
StructField('End_of_Period',DateType(),True),\
StructField('Loan_Number',StringType(),True),\
StructField('Region',StringType(),True),\
StructField('Country_Code',StringType(),True),\
StructField('Country',StringType(),True),\
StructField('Borrower',StringType(),True),\
StructField('Guarantor_Country_Code',StringType(),True),\
StructField('Guarantor',StringType(),True),\
StructField('Loan_Type',StringType(),True),\
StructField('Loan_Status',StringType(),True),\
StructField('Interest_Rate',DecimalType(6,4),True),\
StructField('Currency_of_Commitment',StringType(),True),\
StructField('Project_ID',StringType(),True),\
StructField('Project_Name',StringType(),True),\
StructField('Original_Principal_Amount',DecimalType(14,2),True),\
StructField('Cancelled_Amount',DecimalType(14,2),True),\
StructField('Undisbursed_Amount',DecimalType(14,2),True),\
StructField('Disbursed_Amount',DecimalType(14,2),True),\
StructField('Repaid_to_IBRD',DecimalType(14,2),True),\
StructField('Due_to_IBRD',DecimalType(14,2),True),\
StructField('Exchange_Adjustment',DecimalType(14,2),True),\
StructField('Borrowers_Obligation',DecimalType(14,2),True),\
StructField('Sold_3rd_Party',DecimalType(14,2),True),\
StructField('Repaid_3rd_Party',DecimalType(14,2),True),\
StructField('Due_3rd_Party',DecimalType(14,2),True),\
StructField('Loans_Held',DecimalType(14,2),True),\
StructField('First_Repayment_Date',DateType(),True),\
StructField('Last_Repayment_Date',DateType(),True),\
StructField('Agreement_Signing_Date',DateType(),True),\
StructField('Board_Approval_Date',DateType(),True),\
StructField('Effective_Date',DateType(),True),\
StructField('Closed_Date',DateType(),True),\
StructField('Last_Disbursement_Date',DateType(),True)\
])

hist_loanDF = spark.read.format("jdbc").option("url","jdbc:mysql://localhost:3306/finance?useSSL=false").option("driver", "com.mysql.jdbc.Driver").option("dbtable", "hist_loan").option("lowerBound", "1").option("upperBound", "1023439").option("numPartitions", "5").option("partitionColumn","id").option("user", "hiveuser").option("password", "hivepassword").option("header","true").option("escape", "\"").option("quote", "\"").option("multiline","true").option("inferschema","schema").load()
#print(hist_loanDF.printSchema())
#print(hist_loanDF.count())
from pyspark.sql import functions as F
for x in hist_loanDF.schema.fields:
	if str(x.dataType) != "StringType":
		#print(type(x.dataType))
		continue
	print(x.name)
	hist_loanDF = hist_loanDF.withColumn(x.name, F.initcap(F.col(x.name)))
#print('\n\n-----------\n\n',hist_loanDF.printSchema())

hist_loanDF = hist_loanDF.withColumn('Loan_Status',regexp_replace('Loan_Status','Fully Repaid','Repaid')).withColumn('Loan_Status',regexp_replace('Loan_Status','Fully Cancelled','Cancelled')).withColumn('Loan_Status',regexp_replace('Loan_Status','Fully Disbursed','Disbursed'))

hist_loanDF=hist_loanDF.replace('null', '')
hist_loanDF = hist_loanDF.replace('NULL', '')
#hist_loanDF = hist_loanDF.fillna('')

hist_loanDF = hist_loanDF.dropDuplicates(['End_of_Period','Loan_Number','Region','Country_Code','Country','Borrower','Guarantor_Country_Code',\
'Guarantor','Loan_Type','Loan_Status','Interest_Rate','Currency_of_Commitment','Project_ID','Project_Name',\
'Original_Principal_Amount','Cancelled_Amount','Undisbursed_Amount','Disbursed_Amount','Repaid_to_IBRD','Due_to_IBRD',\
'Exchange_Adjustment','Borrowers_Obligation','Sold_3rd_Party','Repaid_3rd_Party','Due_3rd_Party','Loans_Held',\
'First_Repayment_Date','Last_Repayment_Date','Agreement_Signing_Date','Board_Approval_Date','Effective_Date',\
'Closed_Date','Last_Disbursement_Date','End_of_Period','First_Repayment_Date','Last_Repayment_Date','Agreement_Signing_Date',\
'Board_Approval_Date','Effective_Date','Closed_Date','Last_Disbursement_Date'])
#print(hist_loanDF.count())
#hist_loanDF.createTempView("historical_data")
#spark.sql("select distinct Region from historical_data").show()

#----------------EXTERNAL TABLE--------
from pyspark.sql import HiveContext
#sc = SparkContext()
hc = HiveContext(spark)
hist_loanDF.write.format("orc").saveAsTable("finance.fin_clean2")

#print('='*10,"COUNT",'='*10)
#print(hist_loanDF.count())

#print(hist_loanDF.printSchema())

#----------------QUERIES------------------
hist_loanDF.createTempView("historical_data")

print("\n-----Region-wise No of Repaid Loan-----\n")
spark.sql("select Region,count(Loan_status) from loan_view where id in (select max(id) from loan_view group by Loan_Number) and Loan_Status='Repaid' group by region").orderBy("Region")

print("\n-----Total loan sold to a third party, country-wise-----\n")
spark.sql("select Country,sum(Sold_3rd_Party) as Loan_Amount,count(Loan_Number) from historical_data where id in (select max(id) from historical_data where Original_Principal_Amount!=0 group by Loan_Number) and Sold_3rd_Party!=0 group by Country").orderBy("Loan_Amount",ascending=False).show(10)

print("\n-----Top 5 countries based on original principal amount loaned-----\n")
spark.sql("select Country,sum(Original_Principal_Amount) as Loan_Amount,count(Loan_Number) from historical_data where id in (select max(id) from historical_data where Original_Principal_Amount!=0 group by Loan_Number) group by Country").orderBy("Loan_Amount",ascending=False).show(10)

print("\n-----Country-wise distribution of projects-----\n")
spark.sql("select Country, count(Project_ID) as No_Of_Projects from loan_view where id in (select max(id) from loan_view group by Project_ID) group by Country").orderBy("No_Of_Projects",ascending=False)

print("\n-----Top 10 Expensive Projects-----\n")
spark.sql("select Project_ID, Project_Name, Country, count(Loan_Number) as Loans_Applied, sum(Original_Principal_Amount) as Loaned_Amount from loan_view where id in (select max(id) from loan_view group by Loan_Number)and Project_ID is not null group by Project_ID,Project_Name,Country order by Loaned_Amount desc limit 10")

print("\n-----Total Number of Terminations Country-wise-----\n")
spark.sql("select Country,count(Loan_Number) as Terminated_Loan from historical_data where id in (select max(id) from historical_data group by Loan_Number) and Loan_Status='Terminated' group by Country").orderBy("Terminated_Loan",ascending=False).show(10)

print("\n-----Loan Status Counts in 2021-----\n")
spark.sql("select Loan_Status,count(Loan_Number) as No_Of_Loans from historical_data where id in (select max(id) from historical_data group by Loan_Number) and year(End_Of_Period)=2021 group by Loan_Status").orderBy("No_Of_Loans",ascending=False).show()

print("\n-----Original Principal amount for the country is Cancelled in the year 2021-----\n")
spark.sql("Select Country,sum(Original_Principal_Amount),count(Loan_Number) from historical_data where id in (select max(id) from historical_data where Original_Principal_Amount is not null group by Loan_Number) and year(End_Of_Period)= 2021 and Loan_Status ='Cancelled' group by Country order by sum(Original_Principal_Amount) desc ").show(10)

print("\n-----Number of Loans Applied by a Country over the years-----\n")
spark.sql("select Country,year(Agreement_Signing_Date) as Year ,count(Loan_Number) as Loans from historical_data where id in (select max(id) from historical_data group by Loan_Number) group by Country,year(Agreement_Signing_Date)").orderBy("Loans",ascending=False).show(10)

print("\n-----Amount loaned by year-----\n")
spark.sql("select year(Board_Approval_Date) as year,count(Loan_Number) as No_Of_Loans, sum(Original_Principal_Amount) as Total_Amount_Loaned from loan_view where id in (select max(id) from loan_view group by Loan_Number) and year(Board_Approval_Date) is not null group by year(Board_Approval_Date)").orderBy("Total_Amount_Loaned",ascending=False)

print("\n-----10 Biggest loans applied-----\n")
spark.sql("select Country,Loan_Number,Original_Principal_Amount from historical_data where id in (select max(id) from historical_data group by Loan_Number) order by Original_Principal_Amount desc").show(10)

print("\n-----Total Amount of Loans held by country-----\n")
spark.sql("select Country, sum(Loans_Held) as Total_Loan_Held from historical_data where id in (select max(id) from historical_data group by Loan_Number) group by country order by Total_Loan_Held desc").show(10)

print("\n-----No of loans to be paid by countries-----\n")
spark.sql("select Country, count(Loan_Number) as Loans_to_be_paid from historical_data where id in (select max(id) from historical_data group by Loan_Number) and Loans_held!=0 group by country order by Loans_to_be_paid desc").show(10)

print("\n-----Loans Cleared in shortest duration-----\n")
spark.sql("select Country, Loan_Number,Original_Principal_Amount, dateDiff(Last_Repayment_Date,Agreement_Signing_Date)/365 as `Duration(years)` from historical_data where id in ( select min(id) from historical_data where Loan_Number in (select distinct Loan_Number from historical_data where Original_Principal_Amount>0 and Loans_Held>0 and Agreement_Signing_Date is not null) and Loans_Held=0 and Last_Repayment_Date is not null group by Loan_Number) and dateDiff(Last_Repayment_Date,Agreement_Signing_Date) is not null order by `Duration(years)`").show(10)

print("\n-----Top 10 countries with fastest loan repayment-----\n")
spark.sql("select Country, sum(Original_Principal_Amount) as Total_Amt_Paid,count(Loan_Number) as No_Of_Loans_Cleared,avg(dateDiff(Last_Repayment_Date,Agreement_Signing_Date)/365) as `Avg_Repayment_Duration(years)` from historical_data where id in ( select min(id) from historical_data where Loan_Number in (select distinct Loan_Number from historical_data where Original_Principal_Amount>0 and Loans_Held>0 and Agreement_Signing_Date is not null) and Loans_Held=0 and Last_Repayment_Date is not null group by Loan_Number)group by Country order by `Avg_Repayment_Duration(years)`").show(10)

#------------------------- PARTITIONBY,BUCKETBY,COMPRESSION-CODEC,FORMAT ----------------------------
print("\n-----PARTITIONBY,BUCKETBY,COMPRESSION-CODEC,FORMAT-----\n")
hist_loanDF.write.partitionBy("Region").bucketBy(5,"Loan_Number").saveAsTable("finance.financePartition")

hist_loanDF.write.option("compression","bzip2").csv("file:///home/ruch/data/finance/data/")

hist_loanDF.write.partitionBy("Region","Country").bucketBy(5,"Loan_Number").format("orc").option("compression","zlib").saveAsTable("finance.pRegCoun_bOPA_orc")






