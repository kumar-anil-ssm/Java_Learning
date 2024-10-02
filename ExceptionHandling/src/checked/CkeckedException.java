package checked;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CkeckedException {

	public static void main(String[] args) {
		
		
		try {
			FileInputStream fis = new FileInputStream("");
		} catch (FileNotFoundException e) {
			System.out.println("File is not found");
		}
		
	}

}
