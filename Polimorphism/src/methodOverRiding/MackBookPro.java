package methodOverRiding;

public class MackBookPro extends MACBook{
	@Override
	public void start() {
		System.out.println("Inside MackBookPro strt method");
	}
	
	@Override
	public void shutDown() {
		System.out.println("Inside MackBookPro shutdown method");
	}
	
	public void restart() {
		System.out.println("*********************************");
		System.out.println("Inside MackBookPro Restart method");
		System.out.println("*********************************");
	}

}
