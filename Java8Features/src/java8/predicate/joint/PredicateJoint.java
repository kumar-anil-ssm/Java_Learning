package java8.predicate.joint;

import java.util.function.Predicate;

public class PredicateJoint {

	public static void main(String[] args) {

		int x[]= {0,7,10,20,30,40,50,60,33};
		
		Predicate<Integer> p1=i->(i>30);
		Predicate<Integer> p2= i->(i%2==0);
		System.out.println("Greater than 30:");
		method1(p1,x);
		
		System.out.println("Even number");
		method1(p2,x);
		
		System.out.println("Not greater than 30");
		method1(p1.negate(),x);
		
		System.out.println("Greater than 30 and Even");
		method1(p1.and(p2),x);
		
		System.out.println("Greater than 30 OR Even");
		method1(p1.or(p2),x);
	}
		static void method1 (Predicate<Integer> p, int[] x) {
			for(int eachValue:x) {
				if(p.test(eachValue)) {
					System.out.println(eachValue);
				}
			}
		}
	

}
