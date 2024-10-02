
public class Test {
	public static void main(String[] args) {
		ThreeSeries TS =new ThreeSeries();
		TS.accelerator();
		TS.commonFunc();
		
		FiveSeries fs = new FiveSeries();
		fs.accelerator();
		fs.commonFunc();
	}

}

//****************************************NOTES**************************************************************
/*
* 1. we can not use final and abstract combination with a class
* 2. we can't define static combination with abstract on a method
* 3. when we marking child class with final which extends abstract class then make sure it should implementing/overriding all 
*    the method in abstract class.
*/
