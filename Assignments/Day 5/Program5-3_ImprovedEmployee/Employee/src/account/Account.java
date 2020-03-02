package account;

public class Account {
	private final static double DEFAULT_BALANCE = 0.0;
	private double balance;
	Account(Employee emp, double balance) {
		this.balance = balance;
	}

	Account(Employee emp) {
		this(emp, DEFAULT_BALANCE);
	}

	//overridden by all child classes
	public String toString() {
		return "";
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

	// public accessor method for account type, overridden by each child classes
	public AccountType getAccountType() {
		return AccountType.NONE;
	}

	// public accessor method for balance
	public double getBalance() {
		return balance;
	}

	// method to compute interest, overridden by each child classes
	public double computeInterest() {
		return 0.0;
	}
}
