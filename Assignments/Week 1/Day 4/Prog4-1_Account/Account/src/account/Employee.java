package account;

import java.util.Date;
import java.util.GregorianCalendar;

public class Employee {

	// instance fields
	private String name;
	private double salary;
	private GregorianCalendar hireDay;

	// constructor
	Employee(String aName, double aSalary, int aYear, int aMonth, int aDay) {
		name = aName;
		salary = aSalary;
		hireDay = new GregorianCalendar(aYear, aMonth - 1, aDay);
	}

	// instance methods
	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	// needs to be improved!!
	public GregorianCalendar getHireDay() {
		return hireDay;
	}

	public void raiseSalary(double byPercent) {
		double raise = salary * byPercent / 100;
		salary += raise;
	}
	
	public double yearlyFederalTax() {
		
		if(salary > 80000) {
			return salary * 0.28;
		}
		else if(salary > 50000 && salary <= 80000) {
			return salary * 0.24;
		}
		else if(salary > 26000 && salary <= 50000) {
			return salary * 0.2;
		}
		else {
			return 0;
		}
	}

}
