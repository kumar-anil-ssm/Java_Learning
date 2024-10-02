
public class FiveWithZero {

	public static void main(String[] args) {
		int a[]= {2,5,3,4,5,3,1};
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum = sum+ a[i];
			
		}
		System.out.println("sum is:"+sum);
		
		for(int i=0;i<a.length;i++) {
			if(a[i]==5 && a[i+1]==3) {
				a[i+1]=0;
			}
			System.out.print(a[i]);
			
		}
		System.out.println();
		
		
		
	}

}
