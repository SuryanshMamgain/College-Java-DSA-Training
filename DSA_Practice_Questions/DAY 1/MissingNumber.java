//THIS IS LEETCODE PROBLEM-268.

import java.util.Arrays;

public class MissingNumber {

	//USING SUM OF N NATURAL NUMBER FORMULA
	
//	public static int missingNumber(int[] nums) {
//        int sum=0;
//        int missing=0;
//        int len=nums.length;
//        int total=len*(len+1)/2;
//     for(int i=0;i<len;i++){
//         sum+=nums[i];
//     }
//     missing=total-sum;
//     return missing;
//         
//    }
	
	//USING BRUTE FORCE METHOD
	
//	public static int missingNumber(int[] nums) {
//		Arrays.sort(nums);
//		int flag=0;
//		int result=-1;
//		for(int i=0;i<nums.length;i++) {
//			if(nums[i]!=i) {
//				flag=1;
//				result=i;
//				break;
//			}
//			if(flag==0) {
//				return nums.length;
//			}
//		}
//		return result;
//	}
	
	//USING HASHING
	
	public static int missingNumber(int[] nums) {
		int[] hash=new int[1000];
		int result=-1;
		for(int i=0;i<nums.length;i++) {
			hash[nums[i]]=-1;
		}
		for(int i=0;i<hash.length;i++) {
			if(hash[i]!=-1) {
				result=i;
				break;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {9,6,4,2,3,5,7,0,1};
		System.out.println(missingNumber(nums));
		

	}

}
