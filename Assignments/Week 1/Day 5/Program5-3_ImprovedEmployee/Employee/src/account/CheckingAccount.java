package account;

public class CheckingAccount extends Account{

	private final AccountType acctType = AccountType.CHECKING;
	private final double serviceCharge = 5.0;
	
	CheckingAccount(Employee emp, double balance) {
		super(emp, balance);
	}

	@Override
	public AccountType getAccountType() {
		return acctType;
	}

	@Override
	public double getBalance() {
		return super.getBalance() - serviceCharge;
	}
	
	@Override
	public double computeInterest() {
		return 0.02 * super.getBalance();
	}
	
	@Override
	public String toString() {
		return "Account Type: " + acctType + "\nCurrent Balance = " + super.getBalance() + "\n";
	}
}
