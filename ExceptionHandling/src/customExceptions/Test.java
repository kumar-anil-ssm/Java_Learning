package customExceptions;

public class Test {

	public static void main(String[] args) throws CheckedCustumException {
		
		//throw new UnCheckedException("Business error");
		throw new CheckedCustumException("Business exception that needs to be handle");
		
	}

}
