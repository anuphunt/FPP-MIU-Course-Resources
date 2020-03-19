
package account;

public class EmployeeTest {

	public static void main(String[] args) {		
		Employee employee= new Employee("Anup", 80000, 1992, 1, 12);
		
		//Calculates the yearly federal tax and shows output to the console.
		System.out.printf("$"+ employee.yearlyFederalTax() + "\n");
		
		
		Account checking = new Account(employee, AccountType.CHECKING, 300.0);
		Account savings = new Account(employee, AccountType.SAVINGS, 300.0);
		Account retirement = new Account(employee, AccountType.RETIREMENT, 300.0);
		
		Account[] accounts = new Account[] {checking, savings, retirement};
		for(Account acc: accounts) {
			System.out.println(acc.toString());
		}
	}
}
