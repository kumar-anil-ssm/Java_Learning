import java.util.ArrayList;

public class WildCardParams {
	
	public void myMethod(ArrayList<?> l) {
		l.add(null);
		//l.add("Anil");// this will give error because when we use wild card with ? mark -"<?>" then only null value will add
		// to resolve --- myMethod(ArrayList<? extends Thread> l)
		
		
	}

}
