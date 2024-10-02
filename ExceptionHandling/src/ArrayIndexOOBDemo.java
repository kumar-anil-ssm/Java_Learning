
public class ArrayIndexOOBDemo {

	public static void main(String[] args) {
		int arr[]= {10,20,50};
		try {
		System.out.println("Elements of array are:");
		for(int i = 0;i<=arr.length;i++) {
			System.out.println(arr[i]);	
		}
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Index is beyond array lenth");
			
		}
		System.out.println("After array ");
		
	}
	
	void method1() {
		System.out.println("Method1");
	}
}
