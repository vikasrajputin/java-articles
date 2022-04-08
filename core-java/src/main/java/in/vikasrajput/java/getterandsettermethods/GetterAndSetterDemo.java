package in.vikasrajput.java.getterandsettermethods;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class GetterAndSetterDemo {
	private static final Logger logger = LogManager.getLogger(GetterAndSetterDemo.class);

	public static void main(String[] args) {
		runWithGetterAndSetterMethods();
		runWithOnlyGetterMethods();
		runWithOnlySetterMethods();
		runImmutableClassExample();
	}

	private static void runImmutableClassExample() {
		AccountFinal accountFinal = new AccountFinal("John Doe Final", 102, new Address("California", "123"));
		logger.info(" Account Final(Immutable class): Bal: {}, Name: {}, Add city: {}, Add pin: {}",
				accountFinal.getAccountBalance(), accountFinal.getAccountName(), accountFinal.getAddress().getCity(),
				accountFinal.getAddress().getPin());
		accountFinal.getAddress().setCity("California Updated");
		accountFinal.getAddress().setPin("456");
		logger.info(
				" Account Final(Immutable class) After address modification: Bal: {}, Name: {}, Add city: {}, Add pin: {}",
				accountFinal.getAccountBalance(), accountFinal.getAccountName(), accountFinal.getAddress().getCity(),
				accountFinal.getAddress().getPin());
	}

	private static void runWithOnlySetterMethods() {
		AccountWriteOnly accountWriteOnly = new AccountWriteOnly();
		accountWriteOnly.setAccountName("John Doe Updated");
		accountWriteOnly.setAccountBalance(101);
		logger.info(" Account Write only value updated but can be read");
	}

	private static void runWithOnlyGetterMethods() {
		AccountReadOnly accountReadOnly = new AccountReadOnly("John Doe", 100);
		logger.info(" Account Readonly: Bal: {}, Name: {}", accountReadOnly.getAccountBalance(),
				accountReadOnly.getAccountName());
	}

	private static void runWithGetterAndSetterMethods() {
		Account account = new Account();
		account.setAccountName("John");
		account.setAccountBalance(10);
		logger.info(" Account : Bal: {}, Name: {}", account.getAccountBalance(), account.getAccountName());
	}
}
