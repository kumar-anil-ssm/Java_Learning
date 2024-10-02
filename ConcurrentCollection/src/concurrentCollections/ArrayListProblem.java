package concurrentCollections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

import javax.sql.rowset.serial.SQLOutputImpl;

public class ArrayListProblem {

	public static void main(String[] args) {

		// ArrayList<String> Courses = new ArrayList<>();
		CopyOnWriteArrayList<String> Courses = new CopyOnWriteArrayList<String>();
		Courses.add("Java");
		Courses.add("Python");
		Courses.add("Cobra");
		Courses.add("React");

		Iterator<String> iterator = Courses.iterator();
		while (iterator.hasNext()) {
			String Course = iterator.next();
			System.out.println(Course);
			if (Course.equals("React")) {
				Courses.remove(Course); // this will give an "ConcurrentModificationException" error
			}
		}
		System.out.println(Courses);
	}

}
