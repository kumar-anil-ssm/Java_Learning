package com.project.inheritance;

import java.util.Iterator;

public class Manager extends Employee {
	String projects[];

	public Manager(int cardNO, int empId, String name, String dept, double salary, String projects[]) {
		super(cardNO, empId, name, dept, salary);
		this.projects = projects; // to initialize projects
		System.out.println("Inside manager Constructor");
	}
	
	@Override
	protected void work() {
		super.work();
		System.out.println("Manager is managing following projects");
		for (int i=0; i<projects.length; i++) {
			System.out.println(projects[i]);
		}
	}

}
