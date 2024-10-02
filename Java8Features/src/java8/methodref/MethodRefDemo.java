package java8.methodref;

public class MethodRefDemo {
	
	public static void myMethod() {
		for(int i=0;i<10;i++) {
			System.out.println("Child Thread");
		}
	}

	public static void main(String[] args) {
		
		Runnable t= MethodRefDemo::myMethod;
		
		Thread r=new Thread(t);
		r.start();
		
		for (int i=1;i<10;i++) {
			System.out.println("Main Thread");
			
		}
		
	}

}
