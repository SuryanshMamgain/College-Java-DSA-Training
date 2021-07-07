//THIS IS LEETCODE PROBLEM-300

import java.util.Arrays;

public class LIS {
//recursive approach
	static int lengthOfLIS(int[] nums) {
		return lengthOfLIS(nums,0,Integer.MIN_VALUE);
	}
	static int lengthOfLIS(int[] nums,int index,int val) {
		int count1=0;int count2=0;
		if(index==nums.length) {
			return 0;
		}
		if(nums[index]>val) {
			count1=1+lengthOfLIS(nums, index+1, nums[index]);
		}
		count2=lengthOfLIS(nums, index+1, val);
		return Math.max(count1,count2);
	}
//DP
	static int lengthOfLISDP(int[] nums) {
		if(nums==null||nums.length==0) {
			return 0;
		}
		int dp[]=new int[nums.length];
		int result=1;
		Arrays.fill(dp, 1);
		for(int i=1;i<nums.length;i++) {
			for(int j=0;j<i;j++) {
				if(nums[i]>nums[j]) {
					dp[i]=Math.max(dp[j]+1, dp[i]);
				}
			}
		result=Math.max(result, dp[i]);
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]= {10,9,2,5,3,7,101,18};
		System.out.println(lengthOfLIS(nums));
		System.out.println(lengthOfLISDP(nums));
	}

}
