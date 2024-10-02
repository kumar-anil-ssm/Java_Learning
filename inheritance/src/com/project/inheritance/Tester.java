package com.project.inheritance;

public class Tester extends Employee {
	String tools[];

	public Tester(int cardNO, int empId, String name, String dept, double salary, String tools[]) {
		super(cardNO, empId, name, dept, salary);
		this.tools= tools;
		
	}
	@Override
	protected void work() {
		super.work();
		System.out.println("Tester is testing using");
		for (int i=0; i<tools.length; i++) {
			System.out.println(tools[i]);
		}
	}

}
