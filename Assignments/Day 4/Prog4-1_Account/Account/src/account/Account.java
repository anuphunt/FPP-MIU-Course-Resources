package account;

public class Account {
	private final static double DEFAULT_BALANCE = 0.0;
	private double balance;
	private AccountType acctType;
	private Employee employee;

	Account(Employee emp, AccountType acctType, double balance) {
		employee = emp;
		this.acctType = acctType;
		this.balance = balance;
	}

	Account(Employee emp, AccountType acctType) {
		this(emp, acctType, DEFAULT_BALANCE);
	}

	public String toString() {
		return "type = " + acctType + ", balance = " + balance;
	}

	// Question 1: updating the balance field when depositing the money
	public void makeDeposit(double deposit) {
		balance += deposit;
	}

	// checks the withdrawal amount is less than balance, and updates the balance
	public boolean makeWithdrawal(double amount) {
		if (amount < balance) {
			balance -= amount;
			return true;
		}
		return false;
	}

	// public accessor method for account type
	public AccountType getAccountType() {
		return acctType;
	}

	// public accessor method for balance
	public double getBalance() {
		return balance;
	}

	// method to compute interest
	public double computeInterest() {
		switch (acctType) {
		case CHECKING:
			return 0.02 * balance;
		case SAVINGS:
			return 0.04 * balance;
		case RETIREMENT:
			return balance * 0.05;
		default:
			return 0.0;
		}
	}
}
