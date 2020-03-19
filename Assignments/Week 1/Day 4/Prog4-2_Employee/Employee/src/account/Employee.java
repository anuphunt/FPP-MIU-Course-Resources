package account;

import java.util.Date;
import java.util.GregorianCalendar;

public class Employee {
	private Account savingsAcct;
	private Account checkingAcct;
	private Account retirementAcct;
	private String name;
	private Date hireDate;

	public Employee(String name, int yearOfHire, int monthOfHire, int dayOfHire) {
		this.name = name;
		GregorianCalendar cal = new GregorianCalendar(yearOfHire, monthOfHire - 1, dayOfHire);
		hireDate = cal.getTime();
	}

	public void createNewChecking(double startAmount) {
		checkingAcct = new Account(this, AccountType.CHECKING, startAmount);
	}

	public void createNewSavings(double startAmount) {
		savingsAcct = new Account(this, AccountType.SAVINGS, startAmount);
	}

	public void createNewRetirement(double startAmount) {
		retirementAcct = new Account(this, AccountType.RETIREMENT, startAmount);
	}
	
	public String getName() {
		return name;
	}

	public void deposit(AccountType acctType, double amt) {
		switch(acctType) {
		case CHECKING:
			checkingAcct.makeDeposit(amt);
			break;
		case SAVINGS:
			savingsAcct.makeDeposit(amt);
			break;
		case RETIREMENT:
			retirementAcct.makeDeposit(amt);
			break;
		}
	}

	public boolean withdraw(AccountType acctType, double amt) {
		switch(acctType) {
		case CHECKING:
			return checkingAcct.makeWithdrawal(amt);
		case SAVINGS:
			return savingsAcct.makeWithdrawal(amt);
		case RETIREMENT:
			return retirementAcct.makeWithdrawal(amt);
		default:
			return false;
		}
	}

	public String getFormattedAcctInfo() {
		StringBuffer sb = new StringBuffer();
		sb.append(checkingAcct.toString());
		sb.append(savingsAcct.toString());
		sb.append(retirementAcct.toString());
		
		return sb.toString();
	}

}
