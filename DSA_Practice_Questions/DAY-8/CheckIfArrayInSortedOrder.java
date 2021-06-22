//Check if array is in sorted order using Recursion
public class CheckIfArrayInSortedOrder {
	
	public static boolean checkSort(int[] nums,int n,int m) {
		
		if(nums.length==1) {
			return true;
		}
		if(nums[n]>nums[m]) {
			return false;
		}
		if(m==nums.length-1) {
			return true;
		}
		
		return checkSort(nums,n+1,m+1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {10,20,90,130,120};
		System.out.println(checkSort(nums,0,1));
	}

}
