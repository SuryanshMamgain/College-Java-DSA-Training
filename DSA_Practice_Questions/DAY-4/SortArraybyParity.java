//THIS IS LEETCODE PROBLEM-905.
//I HAVE USED 3 APPROACHES->
////brute force
////using arraylist
////using two pointer approach
import java.util.ArrayList;

public class SortArraybyParity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int[] nums= {3,1,2,4};
         System.out.println("BRUTE FORCE METHOD");
		 int[] arr=new int[nums.length];
	        int i=0;
	        int j=0;
	        for(i=0;i<nums.length;i++){
	            if(nums[i]%2==0){
	                arr[j]=nums[i];
	                j++;            
	            }
	        }
	        for(i=0;i<nums.length;i++){
	            if(nums[i]%2!=0){
	                arr[j]=nums[i];
	                j++;
	            }
	        }
	        for(int ele:arr) {
	        	System.out.print(ele+" ");
	        }
	        ////////////////////////////////////////////////////////////////////////////////////
	        System.out.println();
	        System.out.println("USING ARRAY LIST");
	         ArrayList<Integer> newarr=new ArrayList<>();
	         ArrayList<Integer> rem=new ArrayList<>();
	         int[] a=new int[nums.length];
	         for(int k=0;k<nums.length;k++){
	             if(nums[k]%2==0){
	                 newarr.add(nums[k]);
	             }
	             else{
	                 rem.add(nums[k]);
	             }
	         }
	         newarr.addAll(rem);
	         for(int ele:newarr){
	             System.out.print(ele+" ");
	         }
	         ////////////////////////////////////////////////////////////////////////////////////
	         System.out.println();
	         System.out.println("USING TWO POINTER");
	         int c=0;
	         int h=nums.length-1;
	         while(c<=h) {
	        	 if(nums[c]%2!=0) {
	        		 int temp=nums[c];
	        		 nums[c]=nums[h];
	        		 nums[h]=temp;
	        		 h--;
	        	 }
	        	 else {
	        		 c++;
	        	 }
	         }
	         for(int ele:nums) {
	         System.out.print(ele+" ");
	         }

}
}
