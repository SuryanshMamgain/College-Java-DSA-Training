//THIS IS LEETCODE PROBLEM-26.

public class RemoveDuplicatesFromSortedArray {

	public static int removeDuplicates(int[] nums) {
	    int len=nums.length;
	    int j=0;
	    for(int i=0;i<len;i++){
	        if(i<len-1 &&nums[i]==nums[i+1]){
	            continue;
	        }
	        nums[j]=nums[i];
	        j++;
	    }
	     return j;   
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {0,0,1,1,1,2,2,3,3,4};
		System.out.println(removeDuplicates(nums));
	}

}
