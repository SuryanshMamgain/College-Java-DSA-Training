//THIS IS GEEKS FOR GEEKS PRACTICE PROBLEM
//https://practice.geeksforgeeks.org/problems/leaders-in-an-array-1587115620/1#

import java.util.ArrayList;
import java.util.Collections;
public class LeadersInAnArray {
	
	static ArrayList<Integer> leaders(int arr[], int n){
        // Your code here
        ArrayList<Integer> result=new ArrayList<>();
        int max=0;
        int len=arr.length;
        for(int i=len-1;i>=0;i--){
           if(arr[i]>=max){
              result.add(arr[i]);
               max=arr[i];
           }
       
    }
     Collections.reverse(result);
     return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {16,17,4,3,5,2};
		ArrayList<Integer> arr=leaders(nums,6) ;
		for(int val:arr) {
			System.out.println(val);
		}
	}

}
