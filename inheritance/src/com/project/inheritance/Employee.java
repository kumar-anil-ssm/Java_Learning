package com.project.inheritance;

public class Employee {
	int cardNO;
	int empId;
	String name;
	String dept;
	double salary;
	public Employee(int cardNO, int empId, String name, String dept, double salary) {
		super();
		System.out.println("Inside Employee Constructor");
		this.cardNO = cardNO;
		this.empId = empId;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
		
	}
	
	protected void work() {
		System.out.println("Common work for everyone");
	}

}
