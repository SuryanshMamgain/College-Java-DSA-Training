import java.util.Arrays;

public class Largest {
//USINGG BRUTE FORCE METHOD
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {2,13,4,1,3,6,28};
		int max1=0;
		int max2=0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]>max1) {
				max1=nums[i];
			}
		}
		int temp=0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]>max2) {
				temp=nums[i];
				if(temp<max1) {
					max2=nums[i];
				}
			}
		}
		System.out.println("USING BRUTE FORCE METHOD");
		System.out.println("First Largest: "+max1);
		System.out.println("Second Largest: "+max2);
		
//USING SORT FUNCTION
		Arrays.sort(nums);
		System.out.println("USING SORT FUNCTION");
		System.out.println("First Largest: "+nums[nums.length-1]);
		System.out.println("Second Largest: "+nums[nums.length-2]);
		
	}

}
