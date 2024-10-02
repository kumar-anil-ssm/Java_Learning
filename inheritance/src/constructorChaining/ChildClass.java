package constructorChaining;

public class ChildClass extends SuperClass {
	
	public ChildClass() {
		this(10); //This will invoke "ChildClass(int x)"
		System.out.println("No Arg Child constructor");
	}
	
	
	ChildClass(int x){
		super(x); // This will invoke "SSuperClass(int x)" which is in super class
		System.out.println("Arg Child constructor");
		
	}
	
	public static void main(String[] args) {
		ChildClass c = new ChildClass();
		
	}

}
