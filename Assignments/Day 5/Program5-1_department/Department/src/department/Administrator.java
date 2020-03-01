package department;

import java.util.Date;

public class Administrator extends DeptEmployee {
	private int numberOfHoursWorked; 
	
	public Administrator(String name, double salary, Date hireDate) {
		super(name, salary, hireDate);
	}

	public int getNumberOfHoursWorked() {
		return numberOfHoursWorked;
	}

	public void setNumberOfHoursWorked(int numberOfHoursWorked) {
		this.numberOfHoursWorked = numberOfHoursWorked;
	}
	
	public double ComputeSalary() {
		return numberOfHoursWorked * 20.0;
	}

}
