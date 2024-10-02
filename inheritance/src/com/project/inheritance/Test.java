package com.project.inheritance;

public class Test {

	public static void main(String[] args) {
		String[] projects = new String[] {"Bus Booking","Banking","Finance","Fligh Booking","SBI card"};
		Manager manager = new Manager(1234, 2347835, "Anil", "IT", 50000, projects);
		System.out.println(manager.cardNO);
		System.out.println(manager.empId);
		System.out.println(manager.name);
		System.out.println(manager.dept);
		System.out.println(manager.salary);
		manager.work();
		System.out.println("************************************************************");
		Developer developer= new Developer(1111, 3455,"Rahul", "Bank", 60000, "Spring Boot");
		System.out.println(developer.cardNO);
		System.out.println(developer.empId);
		System.out.println(developer.name);
		System.out.println(developer.dept);
		System.out.println(developer.salary);
		developer.work();
	}

}
