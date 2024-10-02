package overriding;

public class Child extends Parent {
	String s="child";

	public static void doSomeThing() {       // Static method can only override with static method
		System.out.println("inside child");
		
	}
	
	public void print() {
		System.out.println("Hello i am in  child");
	}
}
