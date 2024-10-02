package java8.predicate;

import java.util.function.Predicate;

public class LengthOfString {

	public static void main(String[] args) {

		Predicate<String> p= s->(s.length()>3);
		System.out.println(p.test("Anil"));
		System.out.println(p.test("Ram"));
	}

}
