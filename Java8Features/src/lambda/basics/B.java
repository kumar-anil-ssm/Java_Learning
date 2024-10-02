package lambda.basics;
@FunctionalInterface
public interface B extends A {
	 void myMethod();
	 //void myMethod1(); // Interface "B" doesn't contain any other method except myMethod() because of "@FunctionaInterface"

}
