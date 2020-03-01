package department;

import java.util.Date;

public class DeptEmployee {
	protected String name;
	protected double salary;
	protected Date hireDate;
	
	public DeptEmployee(String name, Double salary, Date hireDate) {
		this.name = name;
		this.salary = salary;
		this.hireDate = hireDate;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getHireDate() {
		return hireDate;
	}
	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}	
	
	public double computeSalary() {
		return salary;
	}
}
