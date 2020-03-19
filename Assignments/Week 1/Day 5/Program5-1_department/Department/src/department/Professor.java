package department;

import java.util.Date;

public class Professor extends DeptEmployee {
	protected int numberOfPublications;
	
	public Professor(String name, Double salary, Date hireDate) {
		super(name, salary, hireDate);
	}

	public int getNumberOfPublications() {
		return numberOfPublications;
	}

	public void setNumberOfPublications(int numberOfPublications) {
		this.numberOfPublications = numberOfPublications;
	}
}
