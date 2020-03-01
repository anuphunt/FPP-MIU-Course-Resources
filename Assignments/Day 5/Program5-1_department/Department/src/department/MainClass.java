package department;

import java.util.Date;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Professor p1 = new Professor("James", 800000.0, new Date());
		Professor p2 = new Professor("Joe", 90000.0, new Date());
		Professor p3 = new Professor("Harry", 100000.0, new Date());

		p1.numberOfPublications = 10;
		p2.numberOfPublications = 10;
		p3.numberOfPublications = 10;

		Secretary s1 = new Secretary("Sally", 800000.0, new Date());
		Secretary s2 = new Secretary("Susan", 900000.0, new Date());

		s1.overTimeHours = 200;
		s2.overTimeHours = 200;

		DeptEmployee[] department = new DeptEmployee[] { p1, p2, p3, s1, s2 };

		System.out.println("Do you want to see the sum of all salaries in the department? Y/N: ");
		if (sc.nextLine().equalsIgnoreCase("Y")) {
			System.out.println(displaySalarySum(department));
		}

		System.out.println("Would you like to search the details of James? Y/N ");
		if (sc.nextLine().equalsIgnoreCase("Y")) {
			for (int i = 0; i < department.length; i++) {
				if (department[i].getName().equalsIgnoreCase("James")) {
					String result = String.format("Name: %s \nSalary: %f \nDate: %s", department[i].getName(),
							department[i].computeSalary(), department[i].getHireDate());
					System.out.println(result);
				}
			}
		}
		sc.close();
	}

	static double displaySalarySum(DeptEmployee[] dept) {
		double salarySum = 0.0;

		for (DeptEmployee employee : dept) {
			salarySum += employee.computeSalary();
		}
		return salarySum;
	}
}
