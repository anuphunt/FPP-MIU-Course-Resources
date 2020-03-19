package account;

public class SavingsAccount extends Account{

	private final AccountType acctType = AccountType.SAVINGS;
	private final double percentageInterest = 0.25;
	
	SavingsAccount(Employee emp, double balance) {
		super(emp, balance);
	}

	@Override
	public AccountType getAccountType() {
		return acctType;
	}
	
	@Override
	public double getBalance() {
		var balance = super.getBalance();
		var interest = (percentageInterest/100)* balance;
		return balance + interest;
	}
	
	@Override
	public double computeInterest() {
		return 0.04 * super.getBalance();
	}
	
	@Override
	public String toString() {
		return "Account Type: " + acctType + "\nCurrent Balance = " + super.getBalance() + "\n";
	}

}
