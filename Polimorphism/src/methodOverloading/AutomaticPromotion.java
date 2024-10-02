package methodOverloading;

public class AutomaticPromotion {
//	public void print(int i) {
//		System.out.println("Int Version "+i);
//	}
	
	public void print(float f) {
		System.out.println("float Version "+f);
	}
	
//	public void print(String s) {              
//		System.out.println("String Version");
//	}
	public void print(Object s) {
		System.out.println("Object Version");
	}
	

	public static void main(String[] args) {
		
		AutomaticPromotion ap = new AutomaticPromotion();
		ap.print(100);
		ap.print(2.5f);
		ap.print("Hello");  // this will give first preference to String version then object version
		
	}

}
