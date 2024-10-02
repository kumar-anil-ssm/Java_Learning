package methodoverriding;

public class Car extends Vechicle  {
	
	@Override// to check overriding is correct or not
	String fuel() {
		return "Diesel";
	}
}
