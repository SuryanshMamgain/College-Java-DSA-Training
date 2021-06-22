//Find occurence of given element using recursion
public class OccurenceOfGivenElement {
	public static int occurenceOfElement(int[] nums,int target,int len,int count) {
		if(len==-1) {
			return count;
		}
		if(nums[len]==target) {
			count++;
		}
		return occurenceOfElement(nums, target, len-1,count);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {1000,10,2000,90,2000,120};
		
		System.out.println(occurenceOfElement(nums,2000,nums.length-1,0));
	}
}


