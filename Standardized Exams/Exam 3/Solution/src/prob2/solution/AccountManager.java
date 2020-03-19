package prob2.solution;

import java.util.List;

public class AccountManager {
	public static double computeAccountBalanceSum(List<Employee> emps) {
		double balanceSum = 0.0;
		for(Employee e: emps) {
			List<Account> accounts = e.getAccounts();
			for(Account a: accounts) {
				balanceSum += a.getBalance();
			}
		}
		return balanceSum;
	}
}