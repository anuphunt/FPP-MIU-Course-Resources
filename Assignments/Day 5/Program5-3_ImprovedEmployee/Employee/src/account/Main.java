package account;

import java.util.Scanner;

public class Main {
	Employee[] emps = null;
	Scanner sc;

	public static void main(String[] args) {
		new Main();
	}

	Main() {
		emps = new Employee[3];
		emps[0] = new Employee("Jim Daley", 2000, 9, 4);
		emps[1] = new Employee("Bob Reuben", 1998, 1, 5);
		emps[2] = new Employee("Susan Randolph", 1997, 2, 13);

		emps[0].createNewChecking(10500);
		emps[0].createNewSavings(1000);
		emps[0].createNewRetirement(9300);
		emps[1].createNewChecking(34000);
		emps[1].createNewSavings(27000);
		emps[1].createNewRetirement(10038);
		emps[2].createNewChecking(10038);
		emps[2].createNewSavings(12600);
		emps[2].createNewRetirement(9000);

//		for phase I – console output
		sc = new Scanner(System.in);
		System.out.print("A. See a report of all accounts \n" + "B. Make a deposit.\n" + "C. Make a withdrawal.\n"
				+ "Make a Selection A/B/C: \n");

		String answer = sc.next();
		switch (answer){
		case "A":
		case "a":
			System.out.println(getFormattedAccountInfo());
			break;
		case "B":
		case "b":
			startDepositProcess();
			break;
		case "C":
		case "c":
			startWithdrawalProcess();
			break;
		default:
			System.out.println("Please make a right selection.");
			break;
		}
	}

	String getFormattedAccountInfo() {
		StringBuffer sb = new StringBuffer();
		for (Employee employee : emps) {
			sb.append("ACCOUNT INFO FOR " + employee.getName() + ": \n \n");
			sb.append(employee.getFormattedAcctInfo());
			sb.append("\n");
		}
		return sb.toString();
	}

	void startDepositProcess() {

		Employee employee;
		AccountType targetAccount = AccountType.NONE;
		double depositAmount = 0.0;

		for (int i = 0; i < emps.length; i++) {
			System.out.println(i + ". " + emps[i].getName() + "\n");
		}

		employee = selectEmployee();

		if (employee != null) {
			targetAccount = selectAccountType();
		} else {
			System.out.println("Selection Not Valid.");
		}

		if (targetAccount != AccountType.NONE) {
			System.out.println("Deposit amount: ");
			String amountStr = sc.next();

			try {
				depositAmount = Double.parseDouble(amountStr);
			} catch (Exception e) {
				System.out.println("Exception " + e.getMessage());
			}

			employee.deposit(targetAccount, depositAmount);

			System.out.printf("$%.2f has been deposited in the %s account of %s", depositAmount, targetAccount.toString().toLowerCase(),
					employee.getName());
		}
	}
	
	
	private void startWithdrawalProcess() {
		Employee employee;
		AccountType targetAccount = AccountType.NONE;
		double withdrawAmount = 0.0;

		for (int i = 0; i < emps.length; i++) {
			System.out.println(i + ". " + emps[i].getName() + "\n");
		}

		employee = selectEmployee();

		if (employee != null) {
			targetAccount = selectAccountType();
		} else {
			System.out.println("Selection Not Valid.");
		}
		
		if(targetAccount != AccountType.NONE) {
			System.out.println("Withdrawal Amount: ");
			String amountStr = sc.next();
			
			try {
				withdrawAmount = Double.parseDouble(amountStr);
			}
			catch (Exception e) {
				System.out.println("Exception: " + e.getMessage());
			}
			var withdrawSuccess = employee.withdraw(targetAccount, withdrawAmount);
			if(withdrawSuccess) {
				System.out.printf("$%.2f has been withdrawn from %s account of %s", withdrawAmount, targetAccount.toString().toLowerCase(), employee.getName());
			}
			else {
				System.out.println("Withdrawal Failed. Insufficient Amount.");
			}
		}
		
	}

	private AccountType selectAccountType() {
		AccountType targetAccount = null;
		System.out.println("0: Checking \n1: Savings \n2: Retirement");
		String answer1 = sc.next();
		
		switch (answer1) {
		case "0":
			targetAccount = AccountType.CHECKING;
			break;
		case "1":
			targetAccount = AccountType.SAVINGS;
			break;
		case "2":
			targetAccount = AccountType.RETIREMENT;
			break;
		}
		return targetAccount;
	}

	private Employee selectEmployee() {
		Employee employee;
		
		System.out.println("Select an employee: (type a number)");

		String answer = sc.next();
		switch (answer) {
		case "0":
			employee = emps[0];
			break;
		case "1":
			employee = emps[1];
			break;
		case "2":
			employee = emps[2];
			break;
		default:
			employee = null;
		}
		return employee;
	}

	//gets the total balance of all accounts of all employees
	private double totalOfBalances() {
		double sumOfAllBalances =0.0;
		for(Employee e: emps) {
			var accounts = e.getAccounts();
			for(Account a: accounts) {
				sumOfAllBalances += a.getBalance();
			}
		}
		
		return sumOfAllBalances;
	}
}
