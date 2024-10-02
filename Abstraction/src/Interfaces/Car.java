package Interfaces;

public interface Car {
	
	void go(); //here we don't marking these method as public or abstract because compiler by default marks every method inside 
	void stop();//interface as public and abstract. And can not have bodies for these method.

}
