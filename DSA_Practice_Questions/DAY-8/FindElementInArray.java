//Find element in an array using recursion
public class FindElementInArray {

	public static boolean checkElement(int[] nums,int target,int len) {
		if(len==-1) {
			return false;
		}		if(nums[len]==target) {
			return true;
		}
		return checkElement(nums, target, len-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {10,20,90,130,120};
		
		System.out.println(checkElement(nums,140,nums.length-1));
	}

}
