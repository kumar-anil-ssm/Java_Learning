package methodOverRiding;

import methodOverRidingUsingInterfaces.AppleLaptop;

public class Test {

	public static void main(String[] args) {
		AppleLaptop m1 = new MackBookPro();// Object casting - up casting and it has been done implicitly(by default)
		AppleLaptop m2 = new MackBookAIR();
		
		m1.start();
		m1.shutDown();
		MackBookPro m3=(MackBookPro) m1; //Object casting - down casting. it has been done explicitly
		m3.restart();
		
		m2.start();
		m2.shutDown();

	}

}
