package concurrentCollections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

import javax.sql.rowset.serial.SQLOutputImpl;

public class ArrayListProblemMultipleThread extends Thread {
	 static CopyOnWriteArrayList<String> Courses = new CopyOnWriteArrayList<String>();
	
	@Override
	public void run() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Courses.add("HTML");
	}

	public static void main(String[] args) throws InterruptedException {

		ArrayListProblemMultipleThread alp = new ArrayListProblemMultipleThread();
		alp.start();
		
		Courses.add("Java");
		Courses.add("Python");
		Courses.add("Cobra");
		Courses.add("React");

		Iterator<String> iterator = Courses.iterator();
		while (iterator.hasNext()) {
			Thread.sleep(2000);
			String Course = iterator.next();
			System.out.println(Course);
			
		}
		System.out.println(Courses);
	}

}
