from pyspark.sql import SparkSession
from pyspark.sql.types import DecimalType
from pyspark.sql.functions import *

spark = SparkSession.builder.master("local")\
                              .appName("SparkStreamingKafka")\
                              .getOrCreate()

df = spark.readStream.format("kafka").option("kafka.bootstrap.servers", "localhost:9092").option("subscribePattern","finance").option("startingOffsets", "earliest").load()

df = df.selectExpr("CAST(value AS STRING)", "CAST(timestamp as STRING)")
df = df.withColumn("value", regexp_replace('value', '"', ''))

df1 = df\
.withColumn("End_of_Period", split(col("value"), ",").getItem(0))\
.withColumn("Loan_Number", split(col("value"), ",").getItem(1))\
.withColumn("Region", split(col("value"), ",").getItem(2))\
.withColumn("Country_Code", split(col("value"), ",").getItem(3))\
.withColumn("Country", split(col("value"), ",").getItem(4))\
.withColumn("Borrower", split(col("value"), ",").getItem(5))\
.withColumn("Guarantor_Country_Code", split(col("value"), ",").getItem(6))\
.withColumn("Guarantor", split(col("value"), ",").getItem(7))\
.withColumn("Loan_Type", split(col("value"), ",").getItem(8))\
.withColumn("Loan_Status", split(col("value"), ",").getItem(9))\
.withColumn("Interest_Rate", split(col("value"), ",").getItem(10).cast(DecimalType(6,4)))\
.withColumn("Currency_of_Commitment", split(col("value"), ",").getItem(11))\
.withColumn("Project_ID", split(col("value"), ",").getItem(12))\
.withColumn("Project_Name", split(col("value"), ",").getItem(13))\
.withColumn("Original_Principal_Amount", split(col("value"), ",").getItem(14).cast(DecimalType(14,2)))\
.withColumn("Cancelled_Amount", split(col("value"), ",").getItem(15).cast(DecimalType(14,2)))\
.withColumn("Undisbursed_Amount", split(col("value"), ",").getItem(16).cast(DecimalType(14,2)))\
.withColumn("Disbursed_Amount", split(col("value"), ",").getItem(17).cast(DecimalType(14,2)))\
.withColumn("Repaid_to_IBRD", split(col("value"), ",").getItem(18).cast(DecimalType(14,2)))\
.withColumn("Due_to_IBRD", split(col("value"), ",").getItem(19).cast(DecimalType(14,2)))\
.withColumn("Exchange_Adjustment", split(col("value"), ",").getItem(20).cast(DecimalType(14,2)))\
.withColumn("Borrowers_Obligation", split(col("value"), ",").getItem(21).cast(DecimalType(14,2)))\
.withColumn("Sold_3rd_Party", split(col("value"), ",").getItem(22).cast(DecimalType(14,2)))\
.withColumn("Repaid_3rd_Party", split(col("value"), ",").getItem(23).cast(DecimalType(14,2)))\
.withColumn("Due_3rd_Party", split(col("value"), ",").getItem(24).cast(DecimalType(14,2)))\
.withColumn("Loans_Held", split(col("value"), ",").getItem(25).cast(DecimalType(14,2)))\
.withColumn("First_Repayment_Date", split(col("value"), ",").getItem(26))\
.withColumn("Last_Repayment_Date", split(col("value"), ",").getItem(27))\
.withColumn("Agreement_Signing_Date", split(col("value"), ",").getItem(28))\
.withColumn("Board_Approval_Date", split(col("value"), ",").getItem(29))\
.withColumn("Effective_Date", split(col("value"), ",").getItem(30))\
.withColumn("Closed_Date", split(col("value"), ",").getItem(31))\
.withColumn("Last_Disbursement_Date", split(col("value"), ",").getItem(32))\
.drop(col("value"))

#print('='*10,"Writing Stream on console",'='*10)
#print(df1)
df1.writeStream\
.outputMode("append")\
.format("console")\
.option("truncate", "false")\
.start()

#print('\n\n','='*10,"Aggregation",'='*10)
from pyspark.sql.functions import avg
avgDF = df1.groupBy('Country').agg(avg('Sold_3rd_Party'))
avgDF.writeStream\
.outputMode("complete")\
.format("console")\
.option("truncate", "false")\
.start()\

#print('\n\n','='*10,"Windowing",'='*10)
windowDF = df1.groupBy(window(df1.timestamp, "30 seconds", "18 seconds"))\
.agg({'Sold_3rd_Party': "sum"})\
.withColumnRenamed("sum(Sold_3rd_Party)", "sum")\
.orderBy('sum', ascending=False)

query = windowDF.writeStream\
        .outputMode("complete")\
        .format("console")\
        .option("truncate","false")\
        .start()

#print('='*10,"Writing Stream in file",'='*10)
query = df1.writeStream\
.outputMode("append")\
.format("csv")\
.option("checkpointLocation","file:///home/ruch/data/Finance")\
.option("path","file:///home/ruch/data/Finance/agg")\
.start()\
.awaitTermination()





