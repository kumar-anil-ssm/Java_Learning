package superKeuword;

public class Child extends Parent {

	int c, d;

	Child(int a, int b, int c, int d) {
		super(a, b); // invoke parent constructor explicitily
		this.c = c;
		this.d = d;

	}

	void f1() {
		super.f1();
		System.out.println("Inside Child f1()");
	}

	void display() {
		System.out.println("parent a:" + super.a);
		System.out.println("parent b: " + super.b);
		System.out.println("Child c : " + this.c);
		System.out.println("Child d : " + this.d);

	}
}
