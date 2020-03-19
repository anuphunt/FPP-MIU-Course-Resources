package account;

import java.util.ArrayList;
import java.util.GregorianCalendar;

public class Employee {
	private ArrayList<Account> accounts = new ArrayList<Account>();
	private String name;
	public Employee(String name, int yearOfHire, int monthOfHire, int dayOfHire) {
		this.name = name;
		GregorianCalendar cal = new GregorianCalendar(yearOfHire, monthOfHire - 1, dayOfHire);
		cal.getTime();
	}

	public void createNewChecking(double startAmount) {
		getAccounts().add(new CheckingAccount(this, startAmount));
	}

	public void createNewSavings(double startAmount) {
		getAccounts().add(new SavingsAccount(this, startAmount));
	}

	public void createNewRetirement(double startAmount) {
		getAccounts().add(new RetirementAccount(this, startAmount));
	}

	public String getName() {
		return name;
	}

	public void deposit(AccountType acctType, double amt) {
		for (Account account : getAccounts()) {
			if (account.getAccountType() == acctType) {
				account.makeDeposit(amt);
				break;
			}
		}
	}

	public boolean withdraw(AccountType acctType, double amt) {

		boolean withdrawSuccess = false;
		for (Account account : getAccounts()) {
			if (account.getAccountType() == acctType) {
				withdrawSuccess = account.makeWithdrawal(amt);
			}
		}
		return withdrawSuccess;
	}

	public String getFormattedAcctInfo() {
		StringBuffer sb = new StringBuffer();
		for(Account account: getAccounts()) {
			sb.append(account.toString());
		}
		return sb.toString();
	}

	public ArrayList<Account> getAccounts() {
		return accounts;
	}

}
