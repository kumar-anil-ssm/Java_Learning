package methodOverRidingUsingInterfaces;

public class MackBookAIR extends MACBook{
	@Override
	void start() {
		System.out.println("Inside MackBookAIR strt method");
	}
	
	@Override
	void shutDown() {
		System.out.println("Inside MackBookAIR shutdown method");
	}

}
