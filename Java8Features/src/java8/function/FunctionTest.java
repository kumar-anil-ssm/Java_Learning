package java8.function;

import java.util.function.Function;

public class FunctionTest {

	public static void main(String[] args) {

		Function<String,Integer> f= s->s.length();
		System.out.println(f.apply("Anil"));
		System.out.println(f.apply("i an going"));
	}

}
