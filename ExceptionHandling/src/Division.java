import java.util.Scanner;

public class Division {

	public static void main(String[] args) {
		int a,b,c;
		try {
		System.out.println("Enter two numbers");
		Scanner sc = new Scanner(System.in);
		a= sc.nextInt();
		b=sc.nextInt();
		c=a/b; //If this line throws error then next two line of code will not execute,that why we need to handle exception(errors)
		       //properly so that next line of code will execute properly.
		System.out.println("Result: "+c);
		}catch(ArithmeticException e) {
			System.out.println("Please do not enter the second no zero10");
		}finally {  // finally section will execute always when try block throws an error or not. finally can be used without catch block
			System.out.println("Finally");
		}
		
		System.out.println("more code goes here");
	}

}
