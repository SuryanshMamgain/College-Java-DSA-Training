//THIS IS LEETCODE PROBLEM-1299.

public class ReplaceElementWithGreatestElementOnRightSide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {17,18,5,4,6,1};
		int maxval=-1;
        for(int i=nums.length-1;i>=0;i--){
            int temp=nums[i];
            nums[i]=maxval;
            maxval=Math.max(temp,nums[i]);
        }
        for(int ele:nums) {
        	System.out.print(ele+" ");
        }

	}

}
