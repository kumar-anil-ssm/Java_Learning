package java8.methodref.StaticMethods;

public class Test {

	public static void main(String[] args) {

		//Provide the Implementation of WorkInter/doTask which is an interface/method
		// 1st Way=> by Lambda Expression
		
		/*
		WorkInter wi=()->{
			System.out.println("i am Implementation of WorkInter");
			System.out.println("i am an Interface and i contain doTask method");
		};
		
		wi.doTask();
		
		*/
		
		// 2nd Way=> by method reference using :: operator
		
		WorkInter wi=Stuff::doStuff;
		wi.doTask();
		
	}

}
