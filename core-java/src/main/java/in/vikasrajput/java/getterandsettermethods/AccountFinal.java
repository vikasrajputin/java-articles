package in.vikasrajput.java.getterandsettermethods;

public final class AccountFinal {

	private final String accountName;
	private final int accountBalance;
	private final Address address;
	
	public AccountFinal(String accountName, int accountBalance, Address address) {
		this.accountName = accountName;
		this.accountBalance = accountBalance;
		this.address = address;
	}
	
	public String getAccountName() {
		return accountName;
	}
	
	public int getAccountBalance() {
		return accountBalance;
	}

	public Address getAddress() {
		return new Address(address.getCity(),address.getPin()) ;
	}
}