package java8.methodref;

public class MyClass {
	
	public void myMethod1(int i) {  // parameter should be same as which is present in MyInterface
		System.out.println(i);
		for(int j=0;j<10;j++) {
			System.out.println(2*j);
		}
	}

	public static void main(String[] args) {

		MyInterface f=i->System.out.println(i); //Implementation of myMethod which is present in MyInterface by Lambda Expression
		f.myMethod(20);
		
		// Method referencing by :: operator for non static method
		MyClass c= new MyClass();
		MyInterface f2=c::myMethod1; //here we are mapping the instance method(myMethod1) in to the functional Interface(MyInterface)
		                            // Basically we write the implementation of myMethod with the help of myMethod1  
		f2.myMethod(22);             // invocation of myMethod
	}

}
