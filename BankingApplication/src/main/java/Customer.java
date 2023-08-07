import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="customer_detail")
public class Customer {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	//private fields
	private int customerId;
	private long accountNo;
	private int initialAmt;
	private String customerName;
	private String Branch;
	private int amtDeposit;
	private int amtWithdraw;
	private int Balance;

	//Setters and Getters
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public long getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}
	public int getInitialAmt() {
		return initialAmt;
	}
	public void setInitialAmt(int initialAmt) {
		this.initialAmt = initialAmt;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getBranch() {
		return Branch;
	}
	public void setBranch(String branch) {
		Branch = branch;
	}
	
	public int getAmtDeposit() {
		return amtDeposit;
	}
	public void setAmtDeposit(int amtDeposit) {
		this.amtDeposit = amtDeposit;
	}
	public int getAmtWithdraw() {
		return amtWithdraw;
	}
	public void setAmtWithdraw(int amtWithdraw) {
		this.amtWithdraw = amtWithdraw;
	}
	public int getBalance() {
		return Balance;
	}
	public void setBalance(int balance) {
		Balance = balance;
	}
	public Customer(long accountNo, int initialAmt, String customerName, String branch) {
		super();
		this.accountNo = accountNo;
		this.initialAmt = initialAmt;
		this.customerName = customerName;
		Branch = branch;
	}
	public Customer() {
		super();
	}

}
