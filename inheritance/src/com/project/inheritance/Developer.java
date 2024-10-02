package com.project.inheritance;

public class Developer extends Employee {
	String technology;

	public Developer(int cardNO, int empId, String name, String dept, double salary, String technology) {
		super(cardNO, empId, name, dept, salary);
		this.technology = technology; // to initialize technology
		System.out.println("Inside Developer Constructure");
		
	}
	
	@Override
	protected void work() {
		super.work();
		System.out.println("Developer is working on "+ technology);
	}

}
