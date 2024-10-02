package methodOverRidingUsingInterfaces;

public class MackBookPro extends MACBook{
	@Override
	void start() {
		System.out.println("Inside MackBookPro strt method");
	}
	
	@Override
	void shutDown() {
		System.out.println("Inside MackBookPro shutdown method");
	}

}
