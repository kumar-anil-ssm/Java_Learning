package morePrograms;

public class Mycircle implements Circle,CircleTwo {

	public static void main(String[] args) {
		Mycircle c = new Mycircle();
		c.calculateArea();
	}

	@Override
	public void calculateArea() {
		System.out.println(CircleTwo.pi);
	}

	

}
