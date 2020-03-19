package department;

import java.util.Date;

public class Secretary extends DeptEmployee {
	
	protected double overTimeHours;
	
	public Secretary(String name, Double salary, Date hireDate) {
		super(name, salary, hireDate);
	}

	public double getOverTimeHours() {
		return overTimeHours;
	}

	public void setOverTimeHours(double overTimeHours) {
		this.overTimeHours = overTimeHours;
	}
	
	public double computeSalary() {
		return salary + 12*overTimeHours;
	}

}
