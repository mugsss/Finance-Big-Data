start-all.sh
start-spark.sh
sudo mysql --user='root' --password='' trial < /home/ruch/Desktop/consolidate/proSQL.sql

hdfs dfs -mkdir /finance1
hdfs dfs -mkdir /finance1/datasets
hdfs dfs -put /home/ruch/Downloads/IBRD_Statement_Of_Loans_-_Historical_Data.csv /finance1/datasets/

sqoop-import --connect jdbc:mysql://localhost/trial?useSSL=false --username hiveuser --password hivepassword --table hist_loan --create-hive-table --hive-table finance.history_loan --null-string '\\N' --null-non-string '\\N' --hive-import --hive-drop-import-delims -m 5 --target-dir /user/hive/warehouse/fin_bash/finance_final101 --map-column-hive 'Interest_Rate=DECIMAL(6%2C4)','Original_Principal_Amount=DECIMAL(14%2C2)','Cancelled_Amount=DECIMAL(14%2C2)','Undisbursed_Amount=DECIMAL(14%2C2)','Disbursed_Amount=DECIMAL(14%2C2)','Repaid_to_IBRD=DECIMAL(14%2C2)','Due_to_IBRD=DECIMAL(14%2C2)','Exchange_Adjustment=DECIMAL(14%2C2)','Borrowers_Obligation=DECIMAL(14%2C2)','Sold_3rd_Party=DECIMAL(14%2C2)','Repaid_3rd_Party=DECIMAL(14%2C2)','Due_3rd_Party=DECIMAL(14%2C2)','Loans_Held=DECIMAL(14%2C2)',End_of_Period=DATE,First_Repayment_Date=DATE,Last_Repayment_Date=DATE,Agreement_Signing_Date=DATE,Board_Approval_Date=DATE,Effective_Date=DATE,Closed_Date=DATE,Last_Disbursement_Date=DATE

sudo mysql --user='root' --password='' trial < /home/ruch/Desktop/loadLatest.sql

sqoop job --create incremental -- import --connect jdbc:mysql://localhost:3306/trial?useSSL=false --username hiveuser --password hivepassword --table hist_loan --target-dir /user/hive/warehouse/fin_tmp --incremental append --check-column id --last-value 1014423 --hive-import --hive-table finance.history_loan --hive-import --hive-drop-import-delims --m 5 --null-string '\\N' --null-non-string '\\N'  --map-column-hive 'Interest_Rate=DECIMAL(6%2C4)','Original_Principal_Amount=DECIMAL(14%2C2)','Cancelled_Amount=DECIMAL(14%2C2)','Undisbursed_Amount=DECIMAL(14%2C2)','Disbursed_Amount=DECIMAL(14%2C2)','Repaid_to_IBRD=DECIMAL(14%2C2)','Due_to_IBRD=DECIMAL(14%2C2)','Exchange_Adjustment=DECIMAL(14%2C2)','Borrowers_Obligation=DECIMAL(14%2C2)','Sold_3rd_Party=DECIMAL(14%2C2)','Repaid_3rd_Party=DECIMAL(14%2C2)','Due_3rd_Party=DECIMAL(14%2C2)','Loans_Held=DECIMAL(14%2C2)',End_of_Period=DATE,First_Repayment_Date=DATE,Last_Repayment_Date=DATE,Agreement_Signing_Date=DATE,Board_Approval_Date=DATE,Effective_Date=DATE,Closed_Date=DATE,Last_Disbursement_Date=DATE
sqoop job --exec incremental

hive -f hive.q

spark-submit clean_query.py

echo "Kafka process is about to start"
echo "Make sure, all necessary inputs are running!!"
read -p "Press any key to continue... " -n1 -s

spark-submit --packages org.apache.spark:spark-sql-kafka-0-10_2.11:2.4.5 kafka.py


