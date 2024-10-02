package customExceptions;

public class UnCheckedException extends RuntimeException {  // to create unchecked exception class mist extend RuntimeException
	//we need not handle this because this is run time exception
	
	UnCheckedException(String message){
		super(message);
		
	}
	
}
