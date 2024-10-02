package lambda.interfaces;


public class Test {

	public static void main(String[] args) {
         // Using Thread implementation
		/*RunnnableImpl r= new RunnnableImpl();
		Thread t= new Thread(r);
		t.start();
		*/
		
		// Using Lambda function
		Runnable r=()->{
			for(int i=0;i<10;i++) {
				System.out.println("Child Thread");
			}
		};
		Thread t= new Thread(r);
		t.start();
		
		
		for (int i=1;i<10;i++) {
			System.out.println("Main Thread");
			
		}
	}

}
