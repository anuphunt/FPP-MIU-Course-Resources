package account;

public class RetirementAccount extends Account {

	private final AccountType acctType = AccountType.RETIREMENT;
	private final double withdrawalPenalty = 0.20;
	
	RetirementAccount(Employee emp, double balance) {
		super(emp, balance);
	}

	@Override
	public AccountType getAccountType() {
		return acctType;
	}

	@Override
	public boolean makeWithdrawal(double amount) {
		double baseBalance = super.getBalance();
		double penalty = withdrawalPenalty * baseBalance;
		return super.makeWithdrawal(amount + penalty);
	}
	
	@Override
	public double computeInterest() {
		return super.getBalance() * 0.05;
	}
	
	@Override
	public String toString() {
		return "Account Type: " + acctType + "\nCurrent Balance = " + super.getBalance() + "\n";
	}
}
