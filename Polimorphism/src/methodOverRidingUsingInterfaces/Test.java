package methodOverRidingUsingInterfaces;

public class Test {

	public static void main(String[] args) {
		MACBook m1 = new MackBookPro();
		MACBook m2 = new MackBookAIR();
		
		m1.start();
		m1.shutDown();
		
		m2.start();
		m2.shutDown();

	}

}
