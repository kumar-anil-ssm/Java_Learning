import java.util.ArrayList;
import java.util.List;

public class TypeCastingProblem {

	public static void main(String[] args) {

		String[] s = new String[10];
		s[0]="john";
		s[1]="roy";
		
		List l =new ArrayList();
		l.add("Anil");
		l.add("Ram");
		l.add(123);
		
		String name=(String) l.get(0);
		String name1=(String) l.get(1);
		String name2= (String) l.get(2);
		
	}

}
