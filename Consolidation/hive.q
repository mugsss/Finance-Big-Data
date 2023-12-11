use finance;
create external table latest_loan_ext_bash(
id int,
End_of_Period DATE,
Loan_Number VARCHAR(10),
Region VARCHAR(50),
Country_Code VARCHAR(10),
Country VARCHAR(50),
Borrower VARCHAR(50),
Guarantor_Country_Code VARCHAR(10),
Guarantor VARCHAR(50),
Loan_Type VARCHAR(50),
Loan_Status VARCHAR(50),
Interest_Rate DECIMAL(6, 4),
Currency_of_Commitment VARCHAR(50),
Project_ID VARCHAR(10),
Project_Name VARCHAR(50),
Original_Principal_Amount DECIMAL(14, 2),
Cancelled_Amount DECIMAL(14, 2),
Undisbursed_Amount DECIMAL(14, 2),
Disbursed_Amount DECIMAL(14, 2),
Repaid_to_IBRD DECIMAL(14, 2),
Due_to_IBRD DECIMAL(14, 2),
Exchange_Adjustment DECIMAL(14, 2),
Borrowers_Obligation DECIMAL(14, 2),
Sold_3rd_Party DECIMAL(14, 2),
Repaid_3rd_Party DECIMAL(14, 2),
Due_3rd_Party DECIMAL(14, 2),
Loans_Held DECIMAL(14, 2),
First_Repayment_Date DATE,
Last_Repayment_Date DATE,
Agreement_Signing_Date DATE,
Board_Approval_Date DATE,
Effective_Date DATE,
Closed_Date DATE,
Last_Disbursement_Date DATE
)
ROW FORMAT DELIMITED
FIELDS TERMINATED BY ','
STORED AS TEXTFILE
location '/user/ruch/finance_external/latest_data';

INSERT INTO TABLE latest_loan_ext_bash SELECT * FROM history_tmp;
