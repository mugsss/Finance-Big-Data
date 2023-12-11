// ORM class for table 'hist_loan'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Mon May 03 13:32:55 IST 2021
// For connector: org.apache.sqoop.manager.MySQLManager
import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.mapred.lib.db.DBWritable;
import com.cloudera.sqoop.lib.JdbcWritableBridge;
import com.cloudera.sqoop.lib.DelimiterSet;
import com.cloudera.sqoop.lib.FieldFormatter;
import com.cloudera.sqoop.lib.RecordParser;
import com.cloudera.sqoop.lib.BooleanParser;
import com.cloudera.sqoop.lib.BlobRef;
import com.cloudera.sqoop.lib.ClobRef;
import com.cloudera.sqoop.lib.LargeObjectLoader;
import com.cloudera.sqoop.lib.SqoopRecord;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class hist_loan extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("id", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        hist_loan.this.id = (Integer)value;
      }
    });
    setters.put("End_of_Period", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        hist_loan.this.End_of_Period = (java.sql.Date)value;
      }
    });
    setters.put("Loan_Number", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        hist_loan.this.Loan_Number = (String)value;
      }
    });
    setters.put("Region", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        hist_loan.this.Region = (String)value;
      }
    });
    setters.put("Country_Code", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        hist_loan.this.Country_Code = (String)value;
      }
    });
    setters.put("Country", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        hist_loan.this.Country = (String)value;
      }
    });
    setters.put("Borrower", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        hist_loan.this.Borrower = (String)value;
      }
    });
    setters.put("Guarantor_Country_Code", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        hist_loan.this.Guarantor_Country_Code = (String)value;
      }
    });
    setters.put("Guarantor", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        hist_loan.this.Guarantor = (String)value;
      }
    });
    setters.put("Loan_Type", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        hist_loan.this.Loan_Type = (String)value;
      }
    });
    setters.put("Loan_Status", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        hist_loan.this.Loan_Status = (String)value;
      }
    });
    setters.put("Interest_Rate", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        hist_loan.this.Interest_Rate = (java.math.BigDecimal)value;
      }
    });
    setters.put("Currency_of_Commitment", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        hist_loan.this.Currency_of_Commitment = (String)value;
      }
    });
    setters.put("Project_ID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        hist_loan.this.Project_ID = (String)value;
      }
    });
    setters.put("Project_Name", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        hist_loan.this.Project_Name = (String)value;
      }
    });
    setters.put("Original_Principal_Amount", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        hist_loan.this.Original_Principal_Amount = (java.math.BigDecimal)value;
      }
    });
    setters.put("Cancelled_Amount", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        hist_loan.this.Cancelled_Amount = (java.math.BigDecimal)value;
      }
    });
    setters.put("Undisbursed_Amount", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        hist_loan.this.Undisbursed_Amount = (java.math.BigDecimal)value;
      }
    });
    setters.put("Disbursed_Amount", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        hist_loan.this.Disbursed_Amount = (java.math.BigDecimal)value;
      }
    });
    setters.put("Repaid_to_IBRD", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        hist_loan.this.Repaid_to_IBRD = (java.math.BigDecimal)value;
      }
    });
    setters.put("Due_to_IBRD", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        hist_loan.this.Due_to_IBRD = (java.math.BigDecimal)value;
      }
    });
    setters.put("Exchange_Adjustment", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        hist_loan.this.Exchange_Adjustment = (java.math.BigDecimal)value;
      }
    });
    setters.put("Borrowers_Obligation", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        hist_loan.this.Borrowers_Obligation = (java.math.BigDecimal)value;
      }
    });
    setters.put("Sold_3rd_Party", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        hist_loan.this.Sold_3rd_Party = (java.math.BigDecimal)value;
      }
    });
    setters.put("Repaid_3rd_Party", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        hist_loan.this.Repaid_3rd_Party = (java.math.BigDecimal)value;
      }
    });
    setters.put("Due_3rd_Party", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        hist_loan.this.Due_3rd_Party = (java.math.BigDecimal)value;
      }
    });
    setters.put("Loans_Held", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        hist_loan.this.Loans_Held = (java.math.BigDecimal)value;
      }
    });
    setters.put("First_Repayment_Date", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        hist_loan.this.First_Repayment_Date = (java.sql.Date)value;
      }
    });
    setters.put("Last_Repayment_Date", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        hist_loan.this.Last_Repayment_Date = (java.sql.Date)value;
      }
    });
    setters.put("Agreement_Signing_Date", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        hist_loan.this.Agreement_Signing_Date = (java.sql.Date)value;
      }
    });
    setters.put("Board_Approval_Date", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        hist_loan.this.Board_Approval_Date = (java.sql.Date)value;
      }
    });
    setters.put("Effective_Date", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        hist_loan.this.Effective_Date = (java.sql.Date)value;
      }
    });
    setters.put("Closed_Date", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        hist_loan.this.Closed_Date = (java.sql.Date)value;
      }
    });
    setters.put("Last_Disbursement_Date", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        hist_loan.this.Last_Disbursement_Date = (java.sql.Date)value;
      }
    });
  }
  public hist_loan() {
    init0();
  }
  private Integer id;
  public Integer get_id() {
    return id;
  }
  public void set_id(Integer id) {
    this.id = id;
  }
  public hist_loan with_id(Integer id) {
    this.id = id;
    return this;
  }
  private java.sql.Date End_of_Period;
  public java.sql.Date get_End_of_Period() {
    return End_of_Period;
  }
  public void set_End_of_Period(java.sql.Date End_of_Period) {
    this.End_of_Period = End_of_Period;
  }
  public hist_loan with_End_of_Period(java.sql.Date End_of_Period) {
    this.End_of_Period = End_of_Period;
    return this;
  }
  private String Loan_Number;
  public String get_Loan_Number() {
    return Loan_Number;
  }
  public void set_Loan_Number(String Loan_Number) {
    this.Loan_Number = Loan_Number;
  }
  public hist_loan with_Loan_Number(String Loan_Number) {
    this.Loan_Number = Loan_Number;
    return this;
  }
  private String Region;
  public String get_Region() {
    return Region;
  }
  public void set_Region(String Region) {
    this.Region = Region;
  }
  public hist_loan with_Region(String Region) {
    this.Region = Region;
    return this;
  }
  private String Country_Code;
  public String get_Country_Code() {
    return Country_Code;
  }
  public void set_Country_Code(String Country_Code) {
    this.Country_Code = Country_Code;
  }
  public hist_loan with_Country_Code(String Country_Code) {
    this.Country_Code = Country_Code;
    return this;
  }
  private String Country;
  public String get_Country() {
    return Country;
  }
  public void set_Country(String Country) {
    this.Country = Country;
  }
  public hist_loan with_Country(String Country) {
    this.Country = Country;
    return this;
  }
  private String Borrower;
  public String get_Borrower() {
    return Borrower;
  }
  public void set_Borrower(String Borrower) {
    this.Borrower = Borrower;
  }
  public hist_loan with_Borrower(String Borrower) {
    this.Borrower = Borrower;
    return this;
  }
  private String Guarantor_Country_Code;
  public String get_Guarantor_Country_Code() {
    return Guarantor_Country_Code;
  }
  public void set_Guarantor_Country_Code(String Guarantor_Country_Code) {
    this.Guarantor_Country_Code = Guarantor_Country_Code;
  }
  public hist_loan with_Guarantor_Country_Code(String Guarantor_Country_Code) {
    this.Guarantor_Country_Code = Guarantor_Country_Code;
    return this;
  }
  private String Guarantor;
  public String get_Guarantor() {
    return Guarantor;
  }
  public void set_Guarantor(String Guarantor) {
    this.Guarantor = Guarantor;
  }
  public hist_loan with_Guarantor(String Guarantor) {
    this.Guarantor = Guarantor;
    return this;
  }
  private String Loan_Type;
  public String get_Loan_Type() {
    return Loan_Type;
  }
  public void set_Loan_Type(String Loan_Type) {
    this.Loan_Type = Loan_Type;
  }
  public hist_loan with_Loan_Type(String Loan_Type) {
    this.Loan_Type = Loan_Type;
    return this;
  }
  private String Loan_Status;
  public String get_Loan_Status() {
    return Loan_Status;
  }
  public void set_Loan_Status(String Loan_Status) {
    this.Loan_Status = Loan_Status;
  }
  public hist_loan with_Loan_Status(String Loan_Status) {
    this.Loan_Status = Loan_Status;
    return this;
  }
  private java.math.BigDecimal Interest_Rate;
  public java.math.BigDecimal get_Interest_Rate() {
    return Interest_Rate;
  }
  public void set_Interest_Rate(java.math.BigDecimal Interest_Rate) {
    this.Interest_Rate = Interest_Rate;
  }
  public hist_loan with_Interest_Rate(java.math.BigDecimal Interest_Rate) {
    this.Interest_Rate = Interest_Rate;
    return this;
  }
  private String Currency_of_Commitment;
  public String get_Currency_of_Commitment() {
    return Currency_of_Commitment;
  }
  public void set_Currency_of_Commitment(String Currency_of_Commitment) {
    this.Currency_of_Commitment = Currency_of_Commitment;
  }
  public hist_loan with_Currency_of_Commitment(String Currency_of_Commitment) {
    this.Currency_of_Commitment = Currency_of_Commitment;
    return this;
  }
  private String Project_ID;
  public String get_Project_ID() {
    return Project_ID;
  }
  public void set_Project_ID(String Project_ID) {
    this.Project_ID = Project_ID;
  }
  public hist_loan with_Project_ID(String Project_ID) {
    this.Project_ID = Project_ID;
    return this;
  }
  private String Project_Name;
  public String get_Project_Name() {
    return Project_Name;
  }
  public void set_Project_Name(String Project_Name) {
    this.Project_Name = Project_Name;
  }
  public hist_loan with_Project_Name(String Project_Name) {
    this.Project_Name = Project_Name;
    return this;
  }
  private java.math.BigDecimal Original_Principal_Amount;
  public java.math.BigDecimal get_Original_Principal_Amount() {
    return Original_Principal_Amount;
  }
  public void set_Original_Principal_Amount(java.math.BigDecimal Original_Principal_Amount) {
    this.Original_Principal_Amount = Original_Principal_Amount;
  }
  public hist_loan with_Original_Principal_Amount(java.math.BigDecimal Original_Principal_Amount) {
    this.Original_Principal_Amount = Original_Principal_Amount;
    return this;
  }
  private java.math.BigDecimal Cancelled_Amount;
  public java.math.BigDecimal get_Cancelled_Amount() {
    return Cancelled_Amount;
  }
  public void set_Cancelled_Amount(java.math.BigDecimal Cancelled_Amount) {
    this.Cancelled_Amount = Cancelled_Amount;
  }
  public hist_loan with_Cancelled_Amount(java.math.BigDecimal Cancelled_Amount) {
    this.Cancelled_Amount = Cancelled_Amount;
    return this;
  }
  private java.math.BigDecimal Undisbursed_Amount;
  public java.math.BigDecimal get_Undisbursed_Amount() {
    return Undisbursed_Amount;
  }
  public void set_Undisbursed_Amount(java.math.BigDecimal Undisbursed_Amount) {
    this.Undisbursed_Amount = Undisbursed_Amount;
  }
  public hist_loan with_Undisbursed_Amount(java.math.BigDecimal Undisbursed_Amount) {
    this.Undisbursed_Amount = Undisbursed_Amount;
    return this;
  }
  private java.math.BigDecimal Disbursed_Amount;
  public java.math.BigDecimal get_Disbursed_Amount() {
    return Disbursed_Amount;
  }
  public void set_Disbursed_Amount(java.math.BigDecimal Disbursed_Amount) {
    this.Disbursed_Amount = Disbursed_Amount;
  }
  public hist_loan with_Disbursed_Amount(java.math.BigDecimal Disbursed_Amount) {
    this.Disbursed_Amount = Disbursed_Amount;
    return this;
  }
  private java.math.BigDecimal Repaid_to_IBRD;
  public java.math.BigDecimal get_Repaid_to_IBRD() {
    return Repaid_to_IBRD;
  }
  public void set_Repaid_to_IBRD(java.math.BigDecimal Repaid_to_IBRD) {
    this.Repaid_to_IBRD = Repaid_to_IBRD;
  }
  public hist_loan with_Repaid_to_IBRD(java.math.BigDecimal Repaid_to_IBRD) {
    this.Repaid_to_IBRD = Repaid_to_IBRD;
    return this;
  }
  private java.math.BigDecimal Due_to_IBRD;
  public java.math.BigDecimal get_Due_to_IBRD() {
    return Due_to_IBRD;
  }
  public void set_Due_to_IBRD(java.math.BigDecimal Due_to_IBRD) {
    this.Due_to_IBRD = Due_to_IBRD;
  }
  public hist_loan with_Due_to_IBRD(java.math.BigDecimal Due_to_IBRD) {
    this.Due_to_IBRD = Due_to_IBRD;
    return this;
  }
  private java.math.BigDecimal Exchange_Adjustment;
  public java.math.BigDecimal get_Exchange_Adjustment() {
    return Exchange_Adjustment;
  }
  public void set_Exchange_Adjustment(java.math.BigDecimal Exchange_Adjustment) {
    this.Exchange_Adjustment = Exchange_Adjustment;
  }
  public hist_loan with_Exchange_Adjustment(java.math.BigDecimal Exchange_Adjustment) {
    this.Exchange_Adjustment = Exchange_Adjustment;
    return this;
  }
  private java.math.BigDecimal Borrowers_Obligation;
  public java.math.BigDecimal get_Borrowers_Obligation() {
    return Borrowers_Obligation;
  }
  public void set_Borrowers_Obligation(java.math.BigDecimal Borrowers_Obligation) {
    this.Borrowers_Obligation = Borrowers_Obligation;
  }
  public hist_loan with_Borrowers_Obligation(java.math.BigDecimal Borrowers_Obligation) {
    this.Borrowers_Obligation = Borrowers_Obligation;
    return this;
  }
  private java.math.BigDecimal Sold_3rd_Party;
  public java.math.BigDecimal get_Sold_3rd_Party() {
    return Sold_3rd_Party;
  }
  public void set_Sold_3rd_Party(java.math.BigDecimal Sold_3rd_Party) {
    this.Sold_3rd_Party = Sold_3rd_Party;
  }
  public hist_loan with_Sold_3rd_Party(java.math.BigDecimal Sold_3rd_Party) {
    this.Sold_3rd_Party = Sold_3rd_Party;
    return this;
  }
  private java.math.BigDecimal Repaid_3rd_Party;
  public java.math.BigDecimal get_Repaid_3rd_Party() {
    return Repaid_3rd_Party;
  }
  public void set_Repaid_3rd_Party(java.math.BigDecimal Repaid_3rd_Party) {
    this.Repaid_3rd_Party = Repaid_3rd_Party;
  }
  public hist_loan with_Repaid_3rd_Party(java.math.BigDecimal Repaid_3rd_Party) {
    this.Repaid_3rd_Party = Repaid_3rd_Party;
    return this;
  }
  private java.math.BigDecimal Due_3rd_Party;
  public java.math.BigDecimal get_Due_3rd_Party() {
    return Due_3rd_Party;
  }
  public void set_Due_3rd_Party(java.math.BigDecimal Due_3rd_Party) {
    this.Due_3rd_Party = Due_3rd_Party;
  }
  public hist_loan with_Due_3rd_Party(java.math.BigDecimal Due_3rd_Party) {
    this.Due_3rd_Party = Due_3rd_Party;
    return this;
  }
  private java.math.BigDecimal Loans_Held;
  public java.math.BigDecimal get_Loans_Held() {
    return Loans_Held;
  }
  public void set_Loans_Held(java.math.BigDecimal Loans_Held) {
    this.Loans_Held = Loans_Held;
  }
  public hist_loan with_Loans_Held(java.math.BigDecimal Loans_Held) {
    this.Loans_Held = Loans_Held;
    return this;
  }
  private java.sql.Date First_Repayment_Date;
  public java.sql.Date get_First_Repayment_Date() {
    return First_Repayment_Date;
  }
  public void set_First_Repayment_Date(java.sql.Date First_Repayment_Date) {
    this.First_Repayment_Date = First_Repayment_Date;
  }
  public hist_loan with_First_Repayment_Date(java.sql.Date First_Repayment_Date) {
    this.First_Repayment_Date = First_Repayment_Date;
    return this;
  }
  private java.sql.Date Last_Repayment_Date;
  public java.sql.Date get_Last_Repayment_Date() {
    return Last_Repayment_Date;
  }
  public void set_Last_Repayment_Date(java.sql.Date Last_Repayment_Date) {
    this.Last_Repayment_Date = Last_Repayment_Date;
  }
  public hist_loan with_Last_Repayment_Date(java.sql.Date Last_Repayment_Date) {
    this.Last_Repayment_Date = Last_Repayment_Date;
    return this;
  }
  private java.sql.Date Agreement_Signing_Date;
  public java.sql.Date get_Agreement_Signing_Date() {
    return Agreement_Signing_Date;
  }
  public void set_Agreement_Signing_Date(java.sql.Date Agreement_Signing_Date) {
    this.Agreement_Signing_Date = Agreement_Signing_Date;
  }
  public hist_loan with_Agreement_Signing_Date(java.sql.Date Agreement_Signing_Date) {
    this.Agreement_Signing_Date = Agreement_Signing_Date;
    return this;
  }
  private java.sql.Date Board_Approval_Date;
  public java.sql.Date get_Board_Approval_Date() {
    return Board_Approval_Date;
  }
  public void set_Board_Approval_Date(java.sql.Date Board_Approval_Date) {
    this.Board_Approval_Date = Board_Approval_Date;
  }
  public hist_loan with_Board_Approval_Date(java.sql.Date Board_Approval_Date) {
    this.Board_Approval_Date = Board_Approval_Date;
    return this;
  }
  private java.sql.Date Effective_Date;
  public java.sql.Date get_Effective_Date() {
    return Effective_Date;
  }
  public void set_Effective_Date(java.sql.Date Effective_Date) {
    this.Effective_Date = Effective_Date;
  }
  public hist_loan with_Effective_Date(java.sql.Date Effective_Date) {
    this.Effective_Date = Effective_Date;
    return this;
  }
  private java.sql.Date Closed_Date;
  public java.sql.Date get_Closed_Date() {
    return Closed_Date;
  }
  public void set_Closed_Date(java.sql.Date Closed_Date) {
    this.Closed_Date = Closed_Date;
  }
  public hist_loan with_Closed_Date(java.sql.Date Closed_Date) {
    this.Closed_Date = Closed_Date;
    return this;
  }
  private java.sql.Date Last_Disbursement_Date;
  public java.sql.Date get_Last_Disbursement_Date() {
    return Last_Disbursement_Date;
  }
  public void set_Last_Disbursement_Date(java.sql.Date Last_Disbursement_Date) {
    this.Last_Disbursement_Date = Last_Disbursement_Date;
  }
  public hist_loan with_Last_Disbursement_Date(java.sql.Date Last_Disbursement_Date) {
    this.Last_Disbursement_Date = Last_Disbursement_Date;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof hist_loan)) {
      return false;
    }
    hist_loan that = (hist_loan) o;
    boolean equal = true;
    equal = equal && (this.id == null ? that.id == null : this.id.equals(that.id));
    equal = equal && (this.End_of_Period == null ? that.End_of_Period == null : this.End_of_Period.equals(that.End_of_Period));
    equal = equal && (this.Loan_Number == null ? that.Loan_Number == null : this.Loan_Number.equals(that.Loan_Number));
    equal = equal && (this.Region == null ? that.Region == null : this.Region.equals(that.Region));
    equal = equal && (this.Country_Code == null ? that.Country_Code == null : this.Country_Code.equals(that.Country_Code));
    equal = equal && (this.Country == null ? that.Country == null : this.Country.equals(that.Country));
    equal = equal && (this.Borrower == null ? that.Borrower == null : this.Borrower.equals(that.Borrower));
    equal = equal && (this.Guarantor_Country_Code == null ? that.Guarantor_Country_Code == null : this.Guarantor_Country_Code.equals(that.Guarantor_Country_Code));
    equal = equal && (this.Guarantor == null ? that.Guarantor == null : this.Guarantor.equals(that.Guarantor));
    equal = equal && (this.Loan_Type == null ? that.Loan_Type == null : this.Loan_Type.equals(that.Loan_Type));
    equal = equal && (this.Loan_Status == null ? that.Loan_Status == null : this.Loan_Status.equals(that.Loan_Status));
    equal = equal && (this.Interest_Rate == null ? that.Interest_Rate == null : this.Interest_Rate.equals(that.Interest_Rate));
    equal = equal && (this.Currency_of_Commitment == null ? that.Currency_of_Commitment == null : this.Currency_of_Commitment.equals(that.Currency_of_Commitment));
    equal = equal && (this.Project_ID == null ? that.Project_ID == null : this.Project_ID.equals(that.Project_ID));
    equal = equal && (this.Project_Name == null ? that.Project_Name == null : this.Project_Name.equals(that.Project_Name));
    equal = equal && (this.Original_Principal_Amount == null ? that.Original_Principal_Amount == null : this.Original_Principal_Amount.equals(that.Original_Principal_Amount));
    equal = equal && (this.Cancelled_Amount == null ? that.Cancelled_Amount == null : this.Cancelled_Amount.equals(that.Cancelled_Amount));
    equal = equal && (this.Undisbursed_Amount == null ? that.Undisbursed_Amount == null : this.Undisbursed_Amount.equals(that.Undisbursed_Amount));
    equal = equal && (this.Disbursed_Amount == null ? that.Disbursed_Amount == null : this.Disbursed_Amount.equals(that.Disbursed_Amount));
    equal = equal && (this.Repaid_to_IBRD == null ? that.Repaid_to_IBRD == null : this.Repaid_to_IBRD.equals(that.Repaid_to_IBRD));
    equal = equal && (this.Due_to_IBRD == null ? that.Due_to_IBRD == null : this.Due_to_IBRD.equals(that.Due_to_IBRD));
    equal = equal && (this.Exchange_Adjustment == null ? that.Exchange_Adjustment == null : this.Exchange_Adjustment.equals(that.Exchange_Adjustment));
    equal = equal && (this.Borrowers_Obligation == null ? that.Borrowers_Obligation == null : this.Borrowers_Obligation.equals(that.Borrowers_Obligation));
    equal = equal && (this.Sold_3rd_Party == null ? that.Sold_3rd_Party == null : this.Sold_3rd_Party.equals(that.Sold_3rd_Party));
    equal = equal && (this.Repaid_3rd_Party == null ? that.Repaid_3rd_Party == null : this.Repaid_3rd_Party.equals(that.Repaid_3rd_Party));
    equal = equal && (this.Due_3rd_Party == null ? that.Due_3rd_Party == null : this.Due_3rd_Party.equals(that.Due_3rd_Party));
    equal = equal && (this.Loans_Held == null ? that.Loans_Held == null : this.Loans_Held.equals(that.Loans_Held));
    equal = equal && (this.First_Repayment_Date == null ? that.First_Repayment_Date == null : this.First_Repayment_Date.equals(that.First_Repayment_Date));
    equal = equal && (this.Last_Repayment_Date == null ? that.Last_Repayment_Date == null : this.Last_Repayment_Date.equals(that.Last_Repayment_Date));
    equal = equal && (this.Agreement_Signing_Date == null ? that.Agreement_Signing_Date == null : this.Agreement_Signing_Date.equals(that.Agreement_Signing_Date));
    equal = equal && (this.Board_Approval_Date == null ? that.Board_Approval_Date == null : this.Board_Approval_Date.equals(that.Board_Approval_Date));
    equal = equal && (this.Effective_Date == null ? that.Effective_Date == null : this.Effective_Date.equals(that.Effective_Date));
    equal = equal && (this.Closed_Date == null ? that.Closed_Date == null : this.Closed_Date.equals(that.Closed_Date));
    equal = equal && (this.Last_Disbursement_Date == null ? that.Last_Disbursement_Date == null : this.Last_Disbursement_Date.equals(that.Last_Disbursement_Date));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof hist_loan)) {
      return false;
    }
    hist_loan that = (hist_loan) o;
    boolean equal = true;
    equal = equal && (this.id == null ? that.id == null : this.id.equals(that.id));
    equal = equal && (this.End_of_Period == null ? that.End_of_Period == null : this.End_of_Period.equals(that.End_of_Period));
    equal = equal && (this.Loan_Number == null ? that.Loan_Number == null : this.Loan_Number.equals(that.Loan_Number));
    equal = equal && (this.Region == null ? that.Region == null : this.Region.equals(that.Region));
    equal = equal && (this.Country_Code == null ? that.Country_Code == null : this.Country_Code.equals(that.Country_Code));
    equal = equal && (this.Country == null ? that.Country == null : this.Country.equals(that.Country));
    equal = equal && (this.Borrower == null ? that.Borrower == null : this.Borrower.equals(that.Borrower));
    equal = equal && (this.Guarantor_Country_Code == null ? that.Guarantor_Country_Code == null : this.Guarantor_Country_Code.equals(that.Guarantor_Country_Code));
    equal = equal && (this.Guarantor == null ? that.Guarantor == null : this.Guarantor.equals(that.Guarantor));
    equal = equal && (this.Loan_Type == null ? that.Loan_Type == null : this.Loan_Type.equals(that.Loan_Type));
    equal = equal && (this.Loan_Status == null ? that.Loan_Status == null : this.Loan_Status.equals(that.Loan_Status));
    equal = equal && (this.Interest_Rate == null ? that.Interest_Rate == null : this.Interest_Rate.equals(that.Interest_Rate));
    equal = equal && (this.Currency_of_Commitment == null ? that.Currency_of_Commitment == null : this.Currency_of_Commitment.equals(that.Currency_of_Commitment));
    equal = equal && (this.Project_ID == null ? that.Project_ID == null : this.Project_ID.equals(that.Project_ID));
    equal = equal && (this.Project_Name == null ? that.Project_Name == null : this.Project_Name.equals(that.Project_Name));
    equal = equal && (this.Original_Principal_Amount == null ? that.Original_Principal_Amount == null : this.Original_Principal_Amount.equals(that.Original_Principal_Amount));
    equal = equal && (this.Cancelled_Amount == null ? that.Cancelled_Amount == null : this.Cancelled_Amount.equals(that.Cancelled_Amount));
    equal = equal && (this.Undisbursed_Amount == null ? that.Undisbursed_Amount == null : this.Undisbursed_Amount.equals(that.Undisbursed_Amount));
    equal = equal && (this.Disbursed_Amount == null ? that.Disbursed_Amount == null : this.Disbursed_Amount.equals(that.Disbursed_Amount));
    equal = equal && (this.Repaid_to_IBRD == null ? that.Repaid_to_IBRD == null : this.Repaid_to_IBRD.equals(that.Repaid_to_IBRD));
    equal = equal && (this.Due_to_IBRD == null ? that.Due_to_IBRD == null : this.Due_to_IBRD.equals(that.Due_to_IBRD));
    equal = equal && (this.Exchange_Adjustment == null ? that.Exchange_Adjustment == null : this.Exchange_Adjustment.equals(that.Exchange_Adjustment));
    equal = equal && (this.Borrowers_Obligation == null ? that.Borrowers_Obligation == null : this.Borrowers_Obligation.equals(that.Borrowers_Obligation));
    equal = equal && (this.Sold_3rd_Party == null ? that.Sold_3rd_Party == null : this.Sold_3rd_Party.equals(that.Sold_3rd_Party));
    equal = equal && (this.Repaid_3rd_Party == null ? that.Repaid_3rd_Party == null : this.Repaid_3rd_Party.equals(that.Repaid_3rd_Party));
    equal = equal && (this.Due_3rd_Party == null ? that.Due_3rd_Party == null : this.Due_3rd_Party.equals(that.Due_3rd_Party));
    equal = equal && (this.Loans_Held == null ? that.Loans_Held == null : this.Loans_Held.equals(that.Loans_Held));
    equal = equal && (this.First_Repayment_Date == null ? that.First_Repayment_Date == null : this.First_Repayment_Date.equals(that.First_Repayment_Date));
    equal = equal && (this.Last_Repayment_Date == null ? that.Last_Repayment_Date == null : this.Last_Repayment_Date.equals(that.Last_Repayment_Date));
    equal = equal && (this.Agreement_Signing_Date == null ? that.Agreement_Signing_Date == null : this.Agreement_Signing_Date.equals(that.Agreement_Signing_Date));
    equal = equal && (this.Board_Approval_Date == null ? that.Board_Approval_Date == null : this.Board_Approval_Date.equals(that.Board_Approval_Date));
    equal = equal && (this.Effective_Date == null ? that.Effective_Date == null : this.Effective_Date.equals(that.Effective_Date));
    equal = equal && (this.Closed_Date == null ? that.Closed_Date == null : this.Closed_Date.equals(that.Closed_Date));
    equal = equal && (this.Last_Disbursement_Date == null ? that.Last_Disbursement_Date == null : this.Last_Disbursement_Date.equals(that.Last_Disbursement_Date));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.id = JdbcWritableBridge.readInteger(1, __dbResults);
    this.End_of_Period = JdbcWritableBridge.readDate(2, __dbResults);
    this.Loan_Number = JdbcWritableBridge.readString(3, __dbResults);
    this.Region = JdbcWritableBridge.readString(4, __dbResults);
    this.Country_Code = JdbcWritableBridge.readString(5, __dbResults);
    this.Country = JdbcWritableBridge.readString(6, __dbResults);
    this.Borrower = JdbcWritableBridge.readString(7, __dbResults);
    this.Guarantor_Country_Code = JdbcWritableBridge.readString(8, __dbResults);
    this.Guarantor = JdbcWritableBridge.readString(9, __dbResults);
    this.Loan_Type = JdbcWritableBridge.readString(10, __dbResults);
    this.Loan_Status = JdbcWritableBridge.readString(11, __dbResults);
    this.Interest_Rate = JdbcWritableBridge.readBigDecimal(12, __dbResults);
    this.Currency_of_Commitment = JdbcWritableBridge.readString(13, __dbResults);
    this.Project_ID = JdbcWritableBridge.readString(14, __dbResults);
    this.Project_Name = JdbcWritableBridge.readString(15, __dbResults);
    this.Original_Principal_Amount = JdbcWritableBridge.readBigDecimal(16, __dbResults);
    this.Cancelled_Amount = JdbcWritableBridge.readBigDecimal(17, __dbResults);
    this.Undisbursed_Amount = JdbcWritableBridge.readBigDecimal(18, __dbResults);
    this.Disbursed_Amount = JdbcWritableBridge.readBigDecimal(19, __dbResults);
    this.Repaid_to_IBRD = JdbcWritableBridge.readBigDecimal(20, __dbResults);
    this.Due_to_IBRD = JdbcWritableBridge.readBigDecimal(21, __dbResults);
    this.Exchange_Adjustment = JdbcWritableBridge.readBigDecimal(22, __dbResults);
    this.Borrowers_Obligation = JdbcWritableBridge.readBigDecimal(23, __dbResults);
    this.Sold_3rd_Party = JdbcWritableBridge.readBigDecimal(24, __dbResults);
    this.Repaid_3rd_Party = JdbcWritableBridge.readBigDecimal(25, __dbResults);
    this.Due_3rd_Party = JdbcWritableBridge.readBigDecimal(26, __dbResults);
    this.Loans_Held = JdbcWritableBridge.readBigDecimal(27, __dbResults);
    this.First_Repayment_Date = JdbcWritableBridge.readDate(28, __dbResults);
    this.Last_Repayment_Date = JdbcWritableBridge.readDate(29, __dbResults);
    this.Agreement_Signing_Date = JdbcWritableBridge.readDate(30, __dbResults);
    this.Board_Approval_Date = JdbcWritableBridge.readDate(31, __dbResults);
    this.Effective_Date = JdbcWritableBridge.readDate(32, __dbResults);
    this.Closed_Date = JdbcWritableBridge.readDate(33, __dbResults);
    this.Last_Disbursement_Date = JdbcWritableBridge.readDate(34, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.id = JdbcWritableBridge.readInteger(1, __dbResults);
    this.End_of_Period = JdbcWritableBridge.readDate(2, __dbResults);
    this.Loan_Number = JdbcWritableBridge.readString(3, __dbResults);
    this.Region = JdbcWritableBridge.readString(4, __dbResults);
    this.Country_Code = JdbcWritableBridge.readString(5, __dbResults);
    this.Country = JdbcWritableBridge.readString(6, __dbResults);
    this.Borrower = JdbcWritableBridge.readString(7, __dbResults);
    this.Guarantor_Country_Code = JdbcWritableBridge.readString(8, __dbResults);
    this.Guarantor = JdbcWritableBridge.readString(9, __dbResults);
    this.Loan_Type = JdbcWritableBridge.readString(10, __dbResults);
    this.Loan_Status = JdbcWritableBridge.readString(11, __dbResults);
    this.Interest_Rate = JdbcWritableBridge.readBigDecimal(12, __dbResults);
    this.Currency_of_Commitment = JdbcWritableBridge.readString(13, __dbResults);
    this.Project_ID = JdbcWritableBridge.readString(14, __dbResults);
    this.Project_Name = JdbcWritableBridge.readString(15, __dbResults);
    this.Original_Principal_Amount = JdbcWritableBridge.readBigDecimal(16, __dbResults);
    this.Cancelled_Amount = JdbcWritableBridge.readBigDecimal(17, __dbResults);
    this.Undisbursed_Amount = JdbcWritableBridge.readBigDecimal(18, __dbResults);
    this.Disbursed_Amount = JdbcWritableBridge.readBigDecimal(19, __dbResults);
    this.Repaid_to_IBRD = JdbcWritableBridge.readBigDecimal(20, __dbResults);
    this.Due_to_IBRD = JdbcWritableBridge.readBigDecimal(21, __dbResults);
    this.Exchange_Adjustment = JdbcWritableBridge.readBigDecimal(22, __dbResults);
    this.Borrowers_Obligation = JdbcWritableBridge.readBigDecimal(23, __dbResults);
    this.Sold_3rd_Party = JdbcWritableBridge.readBigDecimal(24, __dbResults);
    this.Repaid_3rd_Party = JdbcWritableBridge.readBigDecimal(25, __dbResults);
    this.Due_3rd_Party = JdbcWritableBridge.readBigDecimal(26, __dbResults);
    this.Loans_Held = JdbcWritableBridge.readBigDecimal(27, __dbResults);
    this.First_Repayment_Date = JdbcWritableBridge.readDate(28, __dbResults);
    this.Last_Repayment_Date = JdbcWritableBridge.readDate(29, __dbResults);
    this.Agreement_Signing_Date = JdbcWritableBridge.readDate(30, __dbResults);
    this.Board_Approval_Date = JdbcWritableBridge.readDate(31, __dbResults);
    this.Effective_Date = JdbcWritableBridge.readDate(32, __dbResults);
    this.Closed_Date = JdbcWritableBridge.readDate(33, __dbResults);
    this.Last_Disbursement_Date = JdbcWritableBridge.readDate(34, __dbResults);
  }
  public void loadLargeObjects(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void loadLargeObjects0(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void write(PreparedStatement __dbStmt) throws SQLException {
    write(__dbStmt, 0);
  }

  public int write(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(id, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeDate(End_of_Period, 2 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeString(Loan_Number, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Region, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Country_Code, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Country, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Borrower, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Guarantor_Country_Code, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Guarantor, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Loan_Type, 10 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Loan_Status, 11 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Interest_Rate, 12 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(Currency_of_Commitment, 13 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Project_ID, 14 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Project_Name, 15 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Original_Principal_Amount, 16 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Cancelled_Amount, 17 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Undisbursed_Amount, 18 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Disbursed_Amount, 19 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Repaid_to_IBRD, 20 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Due_to_IBRD, 21 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Exchange_Adjustment, 22 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Borrowers_Obligation, 23 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Sold_3rd_Party, 24 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Repaid_3rd_Party, 25 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Due_3rd_Party, 26 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Loans_Held, 27 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeDate(First_Repayment_Date, 28 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeDate(Last_Repayment_Date, 29 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeDate(Agreement_Signing_Date, 30 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeDate(Board_Approval_Date, 31 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeDate(Effective_Date, 32 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeDate(Closed_Date, 33 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeDate(Last_Disbursement_Date, 34 + __off, 91, __dbStmt);
    return 34;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(id, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeDate(End_of_Period, 2 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeString(Loan_Number, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Region, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Country_Code, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Country, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Borrower, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Guarantor_Country_Code, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Guarantor, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Loan_Type, 10 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Loan_Status, 11 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Interest_Rate, 12 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(Currency_of_Commitment, 13 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Project_ID, 14 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Project_Name, 15 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Original_Principal_Amount, 16 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Cancelled_Amount, 17 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Undisbursed_Amount, 18 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Disbursed_Amount, 19 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Repaid_to_IBRD, 20 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Due_to_IBRD, 21 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Exchange_Adjustment, 22 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Borrowers_Obligation, 23 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Sold_3rd_Party, 24 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Repaid_3rd_Party, 25 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Due_3rd_Party, 26 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Loans_Held, 27 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeDate(First_Repayment_Date, 28 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeDate(Last_Repayment_Date, 29 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeDate(Agreement_Signing_Date, 30 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeDate(Board_Approval_Date, 31 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeDate(Effective_Date, 32 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeDate(Closed_Date, 33 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeDate(Last_Disbursement_Date, 34 + __off, 91, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.id = null;
    } else {
    this.id = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.End_of_Period = null;
    } else {
    this.End_of_Period = new Date(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.Loan_Number = null;
    } else {
    this.Loan_Number = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Region = null;
    } else {
    this.Region = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Country_Code = null;
    } else {
    this.Country_Code = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Country = null;
    } else {
    this.Country = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Borrower = null;
    } else {
    this.Borrower = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Guarantor_Country_Code = null;
    } else {
    this.Guarantor_Country_Code = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Guarantor = null;
    } else {
    this.Guarantor = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Loan_Type = null;
    } else {
    this.Loan_Type = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Loan_Status = null;
    } else {
    this.Loan_Status = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Interest_Rate = null;
    } else {
    this.Interest_Rate = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Currency_of_Commitment = null;
    } else {
    this.Currency_of_Commitment = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Project_ID = null;
    } else {
    this.Project_ID = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Project_Name = null;
    } else {
    this.Project_Name = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Original_Principal_Amount = null;
    } else {
    this.Original_Principal_Amount = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Cancelled_Amount = null;
    } else {
    this.Cancelled_Amount = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Undisbursed_Amount = null;
    } else {
    this.Undisbursed_Amount = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Disbursed_Amount = null;
    } else {
    this.Disbursed_Amount = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Repaid_to_IBRD = null;
    } else {
    this.Repaid_to_IBRD = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Due_to_IBRD = null;
    } else {
    this.Due_to_IBRD = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Exchange_Adjustment = null;
    } else {
    this.Exchange_Adjustment = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Borrowers_Obligation = null;
    } else {
    this.Borrowers_Obligation = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Sold_3rd_Party = null;
    } else {
    this.Sold_3rd_Party = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Repaid_3rd_Party = null;
    } else {
    this.Repaid_3rd_Party = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Due_3rd_Party = null;
    } else {
    this.Due_3rd_Party = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Loans_Held = null;
    } else {
    this.Loans_Held = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.First_Repayment_Date = null;
    } else {
    this.First_Repayment_Date = new Date(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.Last_Repayment_Date = null;
    } else {
    this.Last_Repayment_Date = new Date(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.Agreement_Signing_Date = null;
    } else {
    this.Agreement_Signing_Date = new Date(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.Board_Approval_Date = null;
    } else {
    this.Board_Approval_Date = new Date(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.Effective_Date = null;
    } else {
    this.Effective_Date = new Date(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.Closed_Date = null;
    } else {
    this.Closed_Date = new Date(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.Last_Disbursement_Date = null;
    } else {
    this.Last_Disbursement_Date = new Date(__dataIn.readLong());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.id);
    }
    if (null == this.End_of_Period) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.End_of_Period.getTime());
    }
    if (null == this.Loan_Number) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Loan_Number);
    }
    if (null == this.Region) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Region);
    }
    if (null == this.Country_Code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Country_Code);
    }
    if (null == this.Country) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Country);
    }
    if (null == this.Borrower) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Borrower);
    }
    if (null == this.Guarantor_Country_Code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Guarantor_Country_Code);
    }
    if (null == this.Guarantor) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Guarantor);
    }
    if (null == this.Loan_Type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Loan_Type);
    }
    if (null == this.Loan_Status) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Loan_Status);
    }
    if (null == this.Interest_Rate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.Interest_Rate, __dataOut);
    }
    if (null == this.Currency_of_Commitment) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Currency_of_Commitment);
    }
    if (null == this.Project_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Project_ID);
    }
    if (null == this.Project_Name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Project_Name);
    }
    if (null == this.Original_Principal_Amount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.Original_Principal_Amount, __dataOut);
    }
    if (null == this.Cancelled_Amount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.Cancelled_Amount, __dataOut);
    }
    if (null == this.Undisbursed_Amount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.Undisbursed_Amount, __dataOut);
    }
    if (null == this.Disbursed_Amount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.Disbursed_Amount, __dataOut);
    }
    if (null == this.Repaid_to_IBRD) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.Repaid_to_IBRD, __dataOut);
    }
    if (null == this.Due_to_IBRD) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.Due_to_IBRD, __dataOut);
    }
    if (null == this.Exchange_Adjustment) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.Exchange_Adjustment, __dataOut);
    }
    if (null == this.Borrowers_Obligation) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.Borrowers_Obligation, __dataOut);
    }
    if (null == this.Sold_3rd_Party) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.Sold_3rd_Party, __dataOut);
    }
    if (null == this.Repaid_3rd_Party) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.Repaid_3rd_Party, __dataOut);
    }
    if (null == this.Due_3rd_Party) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.Due_3rd_Party, __dataOut);
    }
    if (null == this.Loans_Held) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.Loans_Held, __dataOut);
    }
    if (null == this.First_Repayment_Date) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.First_Repayment_Date.getTime());
    }
    if (null == this.Last_Repayment_Date) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.Last_Repayment_Date.getTime());
    }
    if (null == this.Agreement_Signing_Date) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.Agreement_Signing_Date.getTime());
    }
    if (null == this.Board_Approval_Date) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.Board_Approval_Date.getTime());
    }
    if (null == this.Effective_Date) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.Effective_Date.getTime());
    }
    if (null == this.Closed_Date) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.Closed_Date.getTime());
    }
    if (null == this.Last_Disbursement_Date) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.Last_Disbursement_Date.getTime());
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.id);
    }
    if (null == this.End_of_Period) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.End_of_Period.getTime());
    }
    if (null == this.Loan_Number) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Loan_Number);
    }
    if (null == this.Region) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Region);
    }
    if (null == this.Country_Code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Country_Code);
    }
    if (null == this.Country) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Country);
    }
    if (null == this.Borrower) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Borrower);
    }
    if (null == this.Guarantor_Country_Code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Guarantor_Country_Code);
    }
    if (null == this.Guarantor) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Guarantor);
    }
    if (null == this.Loan_Type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Loan_Type);
    }
    if (null == this.Loan_Status) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Loan_Status);
    }
    if (null == this.Interest_Rate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.Interest_Rate, __dataOut);
    }
    if (null == this.Currency_of_Commitment) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Currency_of_Commitment);
    }
    if (null == this.Project_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Project_ID);
    }
    if (null == this.Project_Name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Project_Name);
    }
    if (null == this.Original_Principal_Amount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.Original_Principal_Amount, __dataOut);
    }
    if (null == this.Cancelled_Amount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.Cancelled_Amount, __dataOut);
    }
    if (null == this.Undisbursed_Amount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.Undisbursed_Amount, __dataOut);
    }
    if (null == this.Disbursed_Amount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.Disbursed_Amount, __dataOut);
    }
    if (null == this.Repaid_to_IBRD) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.Repaid_to_IBRD, __dataOut);
    }
    if (null == this.Due_to_IBRD) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.Due_to_IBRD, __dataOut);
    }
    if (null == this.Exchange_Adjustment) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.Exchange_Adjustment, __dataOut);
    }
    if (null == this.Borrowers_Obligation) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.Borrowers_Obligation, __dataOut);
    }
    if (null == this.Sold_3rd_Party) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.Sold_3rd_Party, __dataOut);
    }
    if (null == this.Repaid_3rd_Party) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.Repaid_3rd_Party, __dataOut);
    }
    if (null == this.Due_3rd_Party) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.Due_3rd_Party, __dataOut);
    }
    if (null == this.Loans_Held) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.Loans_Held, __dataOut);
    }
    if (null == this.First_Repayment_Date) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.First_Repayment_Date.getTime());
    }
    if (null == this.Last_Repayment_Date) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.Last_Repayment_Date.getTime());
    }
    if (null == this.Agreement_Signing_Date) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.Agreement_Signing_Date.getTime());
    }
    if (null == this.Board_Approval_Date) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.Board_Approval_Date.getTime());
    }
    if (null == this.Effective_Date) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.Effective_Date.getTime());
    }
    if (null == this.Closed_Date) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.Closed_Date.getTime());
    }
    if (null == this.Last_Disbursement_Date) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.Last_Disbursement_Date.getTime());
    }
  }
  private static final DelimiterSet __outputDelimiters = new DelimiterSet((char) 1, (char) 10, (char) 0, (char) 0, false);
  public String toString() {
    return toString(__outputDelimiters, true);
  }
  public String toString(DelimiterSet delimiters) {
    return toString(delimiters, true);
  }
  public String toString(boolean useRecordDelim) {
    return toString(__outputDelimiters, useRecordDelim);
  }
  public String toString(DelimiterSet delimiters, boolean useRecordDelim) {
    StringBuilder __sb = new StringBuilder();
    char fieldDelim = delimiters.getFieldsTerminatedBy();
    __sb.append(FieldFormatter.escapeAndEnclose(id==null?"\\N":"" + id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(End_of_Period==null?"\\N":"" + End_of_Period, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(Loan_Number==null?"\\N":Loan_Number, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(Region==null?"\\N":Region, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(Country_Code==null?"\\N":Country_Code, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(Country==null?"\\N":Country, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(Borrower==null?"\\N":Borrower, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(Guarantor_Country_Code==null?"\\N":Guarantor_Country_Code, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(Guarantor==null?"\\N":Guarantor, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(Loan_Type==null?"\\N":Loan_Type, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(Loan_Status==null?"\\N":Loan_Status, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Interest_Rate==null?"\\N":Interest_Rate.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(Currency_of_Commitment==null?"\\N":Currency_of_Commitment, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(Project_ID==null?"\\N":Project_ID, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(Project_Name==null?"\\N":Project_Name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Original_Principal_Amount==null?"\\N":Original_Principal_Amount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Cancelled_Amount==null?"\\N":Cancelled_Amount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Undisbursed_Amount==null?"\\N":Undisbursed_Amount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Disbursed_Amount==null?"\\N":Disbursed_Amount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Repaid_to_IBRD==null?"\\N":Repaid_to_IBRD.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Due_to_IBRD==null?"\\N":Due_to_IBRD.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Exchange_Adjustment==null?"\\N":Exchange_Adjustment.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Borrowers_Obligation==null?"\\N":Borrowers_Obligation.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Sold_3rd_Party==null?"\\N":Sold_3rd_Party.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Repaid_3rd_Party==null?"\\N":Repaid_3rd_Party.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Due_3rd_Party==null?"\\N":Due_3rd_Party.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Loans_Held==null?"\\N":Loans_Held.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(First_Repayment_Date==null?"\\N":"" + First_Repayment_Date, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Last_Repayment_Date==null?"\\N":"" + Last_Repayment_Date, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Agreement_Signing_Date==null?"\\N":"" + Agreement_Signing_Date, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Board_Approval_Date==null?"\\N":"" + Board_Approval_Date, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Effective_Date==null?"\\N":"" + Effective_Date, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Closed_Date==null?"\\N":"" + Closed_Date, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Last_Disbursement_Date==null?"\\N":"" + Last_Disbursement_Date, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(id==null?"\\N":"" + id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(End_of_Period==null?"\\N":"" + End_of_Period, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(Loan_Number==null?"\\N":Loan_Number, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(Region==null?"\\N":Region, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(Country_Code==null?"\\N":Country_Code, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(Country==null?"\\N":Country, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(Borrower==null?"\\N":Borrower, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(Guarantor_Country_Code==null?"\\N":Guarantor_Country_Code, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(Guarantor==null?"\\N":Guarantor, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(Loan_Type==null?"\\N":Loan_Type, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(Loan_Status==null?"\\N":Loan_Status, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Interest_Rate==null?"\\N":Interest_Rate.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(Currency_of_Commitment==null?"\\N":Currency_of_Commitment, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(Project_ID==null?"\\N":Project_ID, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(Project_Name==null?"\\N":Project_Name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Original_Principal_Amount==null?"\\N":Original_Principal_Amount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Cancelled_Amount==null?"\\N":Cancelled_Amount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Undisbursed_Amount==null?"\\N":Undisbursed_Amount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Disbursed_Amount==null?"\\N":Disbursed_Amount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Repaid_to_IBRD==null?"\\N":Repaid_to_IBRD.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Due_to_IBRD==null?"\\N":Due_to_IBRD.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Exchange_Adjustment==null?"\\N":Exchange_Adjustment.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Borrowers_Obligation==null?"\\N":Borrowers_Obligation.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Sold_3rd_Party==null?"\\N":Sold_3rd_Party.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Repaid_3rd_Party==null?"\\N":Repaid_3rd_Party.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Due_3rd_Party==null?"\\N":Due_3rd_Party.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Loans_Held==null?"\\N":Loans_Held.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(First_Repayment_Date==null?"\\N":"" + First_Repayment_Date, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Last_Repayment_Date==null?"\\N":"" + Last_Repayment_Date, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Agreement_Signing_Date==null?"\\N":"" + Agreement_Signing_Date, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Board_Approval_Date==null?"\\N":"" + Board_Approval_Date, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Effective_Date==null?"\\N":"" + Effective_Date, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Closed_Date==null?"\\N":"" + Closed_Date, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Last_Disbursement_Date==null?"\\N":"" + Last_Disbursement_Date, delimiters));
  }
  private static final DelimiterSet __inputDelimiters = new DelimiterSet((char) 1, (char) 10, (char) 0, (char) 0, false);
  private RecordParser __parser;
  public void parse(Text __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharSequence __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(byte [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(char [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(ByteBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  private void __loadFromFields(List<String> fields) {
    Iterator<String> __it = fields.listIterator();
    String __cur_str = null;
    try {
    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.id = null; } else {
      this.id = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.End_of_Period = null; } else {
      this.End_of_Period = java.sql.Date.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Loan_Number = null; } else {
      this.Loan_Number = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Region = null; } else {
      this.Region = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Country_Code = null; } else {
      this.Country_Code = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Country = null; } else {
      this.Country = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Borrower = null; } else {
      this.Borrower = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Guarantor_Country_Code = null; } else {
      this.Guarantor_Country_Code = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Guarantor = null; } else {
      this.Guarantor = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Loan_Type = null; } else {
      this.Loan_Type = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Loan_Status = null; } else {
      this.Loan_Status = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Interest_Rate = null; } else {
      this.Interest_Rate = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Currency_of_Commitment = null; } else {
      this.Currency_of_Commitment = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Project_ID = null; } else {
      this.Project_ID = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Project_Name = null; } else {
      this.Project_Name = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Original_Principal_Amount = null; } else {
      this.Original_Principal_Amount = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Cancelled_Amount = null; } else {
      this.Cancelled_Amount = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Undisbursed_Amount = null; } else {
      this.Undisbursed_Amount = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Disbursed_Amount = null; } else {
      this.Disbursed_Amount = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Repaid_to_IBRD = null; } else {
      this.Repaid_to_IBRD = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Due_to_IBRD = null; } else {
      this.Due_to_IBRD = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Exchange_Adjustment = null; } else {
      this.Exchange_Adjustment = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Borrowers_Obligation = null; } else {
      this.Borrowers_Obligation = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Sold_3rd_Party = null; } else {
      this.Sold_3rd_Party = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Repaid_3rd_Party = null; } else {
      this.Repaid_3rd_Party = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Due_3rd_Party = null; } else {
      this.Due_3rd_Party = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Loans_Held = null; } else {
      this.Loans_Held = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.First_Repayment_Date = null; } else {
      this.First_Repayment_Date = java.sql.Date.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Last_Repayment_Date = null; } else {
      this.Last_Repayment_Date = java.sql.Date.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Agreement_Signing_Date = null; } else {
      this.Agreement_Signing_Date = java.sql.Date.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Board_Approval_Date = null; } else {
      this.Board_Approval_Date = java.sql.Date.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Effective_Date = null; } else {
      this.Effective_Date = java.sql.Date.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Closed_Date = null; } else {
      this.Closed_Date = java.sql.Date.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Last_Disbursement_Date = null; } else {
      this.Last_Disbursement_Date = java.sql.Date.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.id = null; } else {
      this.id = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.End_of_Period = null; } else {
      this.End_of_Period = java.sql.Date.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Loan_Number = null; } else {
      this.Loan_Number = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Region = null; } else {
      this.Region = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Country_Code = null; } else {
      this.Country_Code = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Country = null; } else {
      this.Country = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Borrower = null; } else {
      this.Borrower = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Guarantor_Country_Code = null; } else {
      this.Guarantor_Country_Code = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Guarantor = null; } else {
      this.Guarantor = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Loan_Type = null; } else {
      this.Loan_Type = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Loan_Status = null; } else {
      this.Loan_Status = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Interest_Rate = null; } else {
      this.Interest_Rate = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Currency_of_Commitment = null; } else {
      this.Currency_of_Commitment = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Project_ID = null; } else {
      this.Project_ID = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Project_Name = null; } else {
      this.Project_Name = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Original_Principal_Amount = null; } else {
      this.Original_Principal_Amount = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Cancelled_Amount = null; } else {
      this.Cancelled_Amount = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Undisbursed_Amount = null; } else {
      this.Undisbursed_Amount = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Disbursed_Amount = null; } else {
      this.Disbursed_Amount = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Repaid_to_IBRD = null; } else {
      this.Repaid_to_IBRD = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Due_to_IBRD = null; } else {
      this.Due_to_IBRD = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Exchange_Adjustment = null; } else {
      this.Exchange_Adjustment = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Borrowers_Obligation = null; } else {
      this.Borrowers_Obligation = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Sold_3rd_Party = null; } else {
      this.Sold_3rd_Party = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Repaid_3rd_Party = null; } else {
      this.Repaid_3rd_Party = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Due_3rd_Party = null; } else {
      this.Due_3rd_Party = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Loans_Held = null; } else {
      this.Loans_Held = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.First_Repayment_Date = null; } else {
      this.First_Repayment_Date = java.sql.Date.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Last_Repayment_Date = null; } else {
      this.Last_Repayment_Date = java.sql.Date.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Agreement_Signing_Date = null; } else {
      this.Agreement_Signing_Date = java.sql.Date.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Board_Approval_Date = null; } else {
      this.Board_Approval_Date = java.sql.Date.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Effective_Date = null; } else {
      this.Effective_Date = java.sql.Date.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Closed_Date = null; } else {
      this.Closed_Date = java.sql.Date.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Last_Disbursement_Date = null; } else {
      this.Last_Disbursement_Date = java.sql.Date.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    hist_loan o = (hist_loan) super.clone();
    o.End_of_Period = (o.End_of_Period != null) ? (java.sql.Date) o.End_of_Period.clone() : null;
    o.First_Repayment_Date = (o.First_Repayment_Date != null) ? (java.sql.Date) o.First_Repayment_Date.clone() : null;
    o.Last_Repayment_Date = (o.Last_Repayment_Date != null) ? (java.sql.Date) o.Last_Repayment_Date.clone() : null;
    o.Agreement_Signing_Date = (o.Agreement_Signing_Date != null) ? (java.sql.Date) o.Agreement_Signing_Date.clone() : null;
    o.Board_Approval_Date = (o.Board_Approval_Date != null) ? (java.sql.Date) o.Board_Approval_Date.clone() : null;
    o.Effective_Date = (o.Effective_Date != null) ? (java.sql.Date) o.Effective_Date.clone() : null;
    o.Closed_Date = (o.Closed_Date != null) ? (java.sql.Date) o.Closed_Date.clone() : null;
    o.Last_Disbursement_Date = (o.Last_Disbursement_Date != null) ? (java.sql.Date) o.Last_Disbursement_Date.clone() : null;
    return o;
  }

  public void clone0(hist_loan o) throws CloneNotSupportedException {
    o.End_of_Period = (o.End_of_Period != null) ? (java.sql.Date) o.End_of_Period.clone() : null;
    o.First_Repayment_Date = (o.First_Repayment_Date != null) ? (java.sql.Date) o.First_Repayment_Date.clone() : null;
    o.Last_Repayment_Date = (o.Last_Repayment_Date != null) ? (java.sql.Date) o.Last_Repayment_Date.clone() : null;
    o.Agreement_Signing_Date = (o.Agreement_Signing_Date != null) ? (java.sql.Date) o.Agreement_Signing_Date.clone() : null;
    o.Board_Approval_Date = (o.Board_Approval_Date != null) ? (java.sql.Date) o.Board_Approval_Date.clone() : null;
    o.Effective_Date = (o.Effective_Date != null) ? (java.sql.Date) o.Effective_Date.clone() : null;
    o.Closed_Date = (o.Closed_Date != null) ? (java.sql.Date) o.Closed_Date.clone() : null;
    o.Last_Disbursement_Date = (o.Last_Disbursement_Date != null) ? (java.sql.Date) o.Last_Disbursement_Date.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("id", this.id);
    __sqoop$field_map.put("End_of_Period", this.End_of_Period);
    __sqoop$field_map.put("Loan_Number", this.Loan_Number);
    __sqoop$field_map.put("Region", this.Region);
    __sqoop$field_map.put("Country_Code", this.Country_Code);
    __sqoop$field_map.put("Country", this.Country);
    __sqoop$field_map.put("Borrower", this.Borrower);
    __sqoop$field_map.put("Guarantor_Country_Code", this.Guarantor_Country_Code);
    __sqoop$field_map.put("Guarantor", this.Guarantor);
    __sqoop$field_map.put("Loan_Type", this.Loan_Type);
    __sqoop$field_map.put("Loan_Status", this.Loan_Status);
    __sqoop$field_map.put("Interest_Rate", this.Interest_Rate);
    __sqoop$field_map.put("Currency_of_Commitment", this.Currency_of_Commitment);
    __sqoop$field_map.put("Project_ID", this.Project_ID);
    __sqoop$field_map.put("Project_Name", this.Project_Name);
    __sqoop$field_map.put("Original_Principal_Amount", this.Original_Principal_Amount);
    __sqoop$field_map.put("Cancelled_Amount", this.Cancelled_Amount);
    __sqoop$field_map.put("Undisbursed_Amount", this.Undisbursed_Amount);
    __sqoop$field_map.put("Disbursed_Amount", this.Disbursed_Amount);
    __sqoop$field_map.put("Repaid_to_IBRD", this.Repaid_to_IBRD);
    __sqoop$field_map.put("Due_to_IBRD", this.Due_to_IBRD);
    __sqoop$field_map.put("Exchange_Adjustment", this.Exchange_Adjustment);
    __sqoop$field_map.put("Borrowers_Obligation", this.Borrowers_Obligation);
    __sqoop$field_map.put("Sold_3rd_Party", this.Sold_3rd_Party);
    __sqoop$field_map.put("Repaid_3rd_Party", this.Repaid_3rd_Party);
    __sqoop$field_map.put("Due_3rd_Party", this.Due_3rd_Party);
    __sqoop$field_map.put("Loans_Held", this.Loans_Held);
    __sqoop$field_map.put("First_Repayment_Date", this.First_Repayment_Date);
    __sqoop$field_map.put("Last_Repayment_Date", this.Last_Repayment_Date);
    __sqoop$field_map.put("Agreement_Signing_Date", this.Agreement_Signing_Date);
    __sqoop$field_map.put("Board_Approval_Date", this.Board_Approval_Date);
    __sqoop$field_map.put("Effective_Date", this.Effective_Date);
    __sqoop$field_map.put("Closed_Date", this.Closed_Date);
    __sqoop$field_map.put("Last_Disbursement_Date", this.Last_Disbursement_Date);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("id", this.id);
    __sqoop$field_map.put("End_of_Period", this.End_of_Period);
    __sqoop$field_map.put("Loan_Number", this.Loan_Number);
    __sqoop$field_map.put("Region", this.Region);
    __sqoop$field_map.put("Country_Code", this.Country_Code);
    __sqoop$field_map.put("Country", this.Country);
    __sqoop$field_map.put("Borrower", this.Borrower);
    __sqoop$field_map.put("Guarantor_Country_Code", this.Guarantor_Country_Code);
    __sqoop$field_map.put("Guarantor", this.Guarantor);
    __sqoop$field_map.put("Loan_Type", this.Loan_Type);
    __sqoop$field_map.put("Loan_Status", this.Loan_Status);
    __sqoop$field_map.put("Interest_Rate", this.Interest_Rate);
    __sqoop$field_map.put("Currency_of_Commitment", this.Currency_of_Commitment);
    __sqoop$field_map.put("Project_ID", this.Project_ID);
    __sqoop$field_map.put("Project_Name", this.Project_Name);
    __sqoop$field_map.put("Original_Principal_Amount", this.Original_Principal_Amount);
    __sqoop$field_map.put("Cancelled_Amount", this.Cancelled_Amount);
    __sqoop$field_map.put("Undisbursed_Amount", this.Undisbursed_Amount);
    __sqoop$field_map.put("Disbursed_Amount", this.Disbursed_Amount);
    __sqoop$field_map.put("Repaid_to_IBRD", this.Repaid_to_IBRD);
    __sqoop$field_map.put("Due_to_IBRD", this.Due_to_IBRD);
    __sqoop$field_map.put("Exchange_Adjustment", this.Exchange_Adjustment);
    __sqoop$field_map.put("Borrowers_Obligation", this.Borrowers_Obligation);
    __sqoop$field_map.put("Sold_3rd_Party", this.Sold_3rd_Party);
    __sqoop$field_map.put("Repaid_3rd_Party", this.Repaid_3rd_Party);
    __sqoop$field_map.put("Due_3rd_Party", this.Due_3rd_Party);
    __sqoop$field_map.put("Loans_Held", this.Loans_Held);
    __sqoop$field_map.put("First_Repayment_Date", this.First_Repayment_Date);
    __sqoop$field_map.put("Last_Repayment_Date", this.Last_Repayment_Date);
    __sqoop$field_map.put("Agreement_Signing_Date", this.Agreement_Signing_Date);
    __sqoop$field_map.put("Board_Approval_Date", this.Board_Approval_Date);
    __sqoop$field_map.put("Effective_Date", this.Effective_Date);
    __sqoop$field_map.put("Closed_Date", this.Closed_Date);
    __sqoop$field_map.put("Last_Disbursement_Date", this.Last_Disbursement_Date);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
