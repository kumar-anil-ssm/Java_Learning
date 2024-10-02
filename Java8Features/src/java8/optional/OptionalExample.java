package java8.optional;

import java.util.Optional;

public class OptionalExample {

	public static void main(String[] args) {

		String[] str=new String[5];
		str[0]="Anil";
		str[1]="RAM";
		str[4]="Tom";
		
//		System.out.println(str[3]);
//		String s1=str[3].toLowerCase();
//		System.out.println(s1);
	//*************************************Use of Optional***********************************************************	
		Optional<String> checknull=Optional.ofNullable(str[1]);
		if (checknull.isPresent()) {
			String s1=str[1].toLowerCase();
			System.out.println(s1);
		}else {
			System.out.println("Value is not present");
		}
	}

}
