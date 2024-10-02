
public class MultiCatch {

	public static void main(String[] args) {
		try {
		String input = args[0];
		System.out.println("Input is: "+ input);
		int output= Integer.parseInt(input);
		System.out.println("Output is: "+output);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Input is required");
			
		}catch(NumberFormatException e) {
			System.out.println("invalid input provided");
		}
		
		System.out.println("more code can goes hre");
	}

}
