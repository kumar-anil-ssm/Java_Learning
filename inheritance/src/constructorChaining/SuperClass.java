package constructorChaining;

public class SuperClass {
	int x;
	public SuperClass() {
		System.out.println("No Arg Parent constructor");
	}
	
	public SuperClass(int x) {
		this(); // This will invoke "SuperClass()" which is above
		this.x=x;
		System.out.println("Arg parent constructor");
		
	}

}
