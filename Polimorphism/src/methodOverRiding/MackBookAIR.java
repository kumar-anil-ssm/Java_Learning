package methodOverRiding;

public class MackBookAIR extends MACBook{
	@Override
	public void start() {
		System.out.println("Inside MackBookAIR strt method");
	}
	
	@Override
	public void shutDown() {
		System.out.println("Inside MackBookAIR shutdown method");
	}

}
