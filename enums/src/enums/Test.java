package enums;

public class Test {

	public static void main(String[] args) {

		PaymentType pt= PaymentType.CREDITCARD;
		System.out.println(pt);
		
		System.out.println("**************************************");
		
		PaymentType[] paymentType = PaymentType.values(); //values() is the method of Enums class
		for (PaymentType paymentType2 : paymentType) {
			System.out.println(paymentType2);
			System.out.println(paymentType2.ordinal());  //.ordinal()- give the position of the constant
			System.out.println(paymentType2.getFee());
		}
	}

}
