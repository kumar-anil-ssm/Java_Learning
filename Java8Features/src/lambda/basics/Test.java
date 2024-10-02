package lambda.basics;

public class Test {

	public static void main(String[] args) {
		
//		A a=new C();
//		a.myMethod();
		
		//********************Lambda Function*****************
		
		A a= ()-> System.out.println("Inside myMethod");
		a.myMethod();
	}

}
