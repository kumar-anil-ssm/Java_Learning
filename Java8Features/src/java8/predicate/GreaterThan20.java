package java8.predicate;

import java.util.function.Predicate;

public class GreaterThan20 {

	public static void main(String[] args) {

		Predicate<Integer> p= i ->(i>20);  // Implementation
		System.out.println(p.test(16));                        // Invocation
		System.out.println(p.test(26)); 
		System.out.println(p.test(10)); 
		
	}

}
