//THIS IS LEETCODE PROBLEM-15.

import java.util.Arrays;

public class TripleSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {-5,-5,0,1,1,2,3,3,4,4};
        int sum=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(i>0&&nums[i]==nums[i-1]){
                continue;
            }
            else{
                int remsum=-1*nums[i];
                int firstpointer=i+1;
                int secondpointer=nums.length-1;
                while(firstpointer<secondpointer){
                    if(nums[firstpointer]+nums[secondpointer]<remsum){
                        firstpointer++;
                    }
                    else if(nums[firstpointer]+nums[secondpointer]>remsum){
                        secondpointer--;
                    }
                    else if(nums[firstpointer]+nums[secondpointer]==remsum){
                        System.out.println("A: "+nums[i]+" B: "+nums[firstpointer]+" C: "+nums[secondpointer]);
                        int firstval=nums[firstpointer];
                        int secval=nums[secondpointer];
                        while(nums[firstpointer]==firstval){
                            firstpointer++;
                        }
                        while(nums[secondpointer]==secval){
                            secondpointer--;
                    }
                }
            }
        }
        
    }
}
}


