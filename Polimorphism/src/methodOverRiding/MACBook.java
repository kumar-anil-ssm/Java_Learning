package methodOverRiding;

import methodOverRidingUsingInterfaces.AppleLaptop;

public class MACBook implements AppleLaptop {
	public void start(){
		System.out.println("Inside MACBook start method");
	}
	public void shutDown(){
		System.out.println("Inside MACBook shutDown method");
	}

}
