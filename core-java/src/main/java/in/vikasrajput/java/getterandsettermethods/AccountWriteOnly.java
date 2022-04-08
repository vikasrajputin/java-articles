package in.vikasrajput.java.getterandsettermethods;

public class AccountWriteOnly {

	private String accountName;
	private int accountBalance;

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public void setAccountBalance(int accountBalance) {
		this.accountBalance = accountBalance;
	}

	// No getter methods to allow public access, 
	// but variables can be accessed within the class
}
