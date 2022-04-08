package in.vikasrajput.java.getterandsettermethods;

public class AccountReadOnly {

	private String accountName;
	private int accountBalance;

	public AccountReadOnly(String accountName, int accountBalance) {
		this.accountBalance = accountBalance;
		this.accountName = accountName;
	}
	
	public String getAccountName() {
		return accountName;
	}

	public int getAccountBalance() {
		return accountBalance;
	}

	// No getter methods to allow public access, 
	// but variables can be modified within the class
}
