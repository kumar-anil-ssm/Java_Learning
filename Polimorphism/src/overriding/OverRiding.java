package overriding;

public class OverRiding {

	public static void main(String[] args) {
		
		Parent.doSomeThing();
		Child.doSomeThing();
		
		Parent p =new Parent();
		System.out.println(p.s);
		
		Child c =new Child();
		System.out.println(c.s);
		
		Parent p1 = new Child(); //here  In case of method child class method will be invoked but it does not apply to the 
		// variables because variable resolution will happen by compiler at  compile time.
		//Parent p1 => at this level the compiler already assign variable value which is in the parent class so variable of parent 
		// class will be print here
		System.out.println(p1.s);
		
		Parent p3 = new Child(); // See the Above explanation
		p3.print();
	}

}
