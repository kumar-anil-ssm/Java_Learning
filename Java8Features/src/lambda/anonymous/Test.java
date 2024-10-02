package lambda.anonymous;


public class Test {

	public static void main(String[] args) {
        
		Thread t= new Thread(()->{
			for (int i=0;i<10;i++) {
				System.out.println("child Thread");
			}
		});
		t.start();
		
		
		for (int i=1;i<10;i++) {
			System.out.println("Main Thread");
			
		}
	}

}
