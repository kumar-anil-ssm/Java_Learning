
public class Customer {
	private String firstName;
	private String lastName;
	private String CreditCard;
	
	public String getFirstName() {
		if(firstName==null) {
			System.out.println("invalid name");
		}
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName= firstName;
		
	}
	
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName=lastName;
	}
	public String getCreditCard() {
		return CreditCard;
	}
	public void setCreditCard(String creditCard) {
		CreditCard = creditCard;
	}

}
