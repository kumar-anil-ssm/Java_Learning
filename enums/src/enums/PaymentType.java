package enums;

public enum PaymentType {
	CREDITCARD(0), DEBITCARD(5),CASH(10);
	
	int fee;
	
	PaymentType(int fee){
		this.fee=fee;
	}
	
	public int getFee() {
		return this.fee;
	}

}
