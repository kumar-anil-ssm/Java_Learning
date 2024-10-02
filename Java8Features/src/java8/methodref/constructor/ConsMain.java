package java8.methodref.constructor;

public class ConsMain {

	public static void main(String[] args) {

		/*
		Provider provider=()->{
			return new Student();
		};
		*/
		//Constructor Reference
		Provider provider= Student::new;
		
		Student student=provider.getStudent();
		student.display();
	}

}
