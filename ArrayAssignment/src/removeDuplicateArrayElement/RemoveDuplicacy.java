package removeDuplicateArrayElement;

public class RemoveDuplicacy {
	public static void main(String[] args) {
		int[] nums= {1,2,2,2,3,4,4,4,5};
		
		int j=0;
		for(int i=0;i<nums.length-1;i++) {
			if(nums[i] != nums[i+1]) {
				nums[j]=nums[i];
				j++;
			}
		}
		nums[j]=nums[nums.length-1];
		for(int i=0;i<j+1;i++) {
			
			System.out.print(nums[i]+" ");
		}
		//int k=j+1;
		System.out.println();
		System.out.println("k="+(j+1));
	}
}


