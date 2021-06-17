//THIS IS LEETCODE PROBLEM-75.
public class DNF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {2,0,2,1,1,0};
		int current=0;
        int lowest=0;
        int highest=nums.length-1;
        int temp=0;
        while(current<=highest){
            if(nums[current]==0){
                temp=nums[current];
                nums[current]=nums[lowest];
                nums[lowest]=temp;
                current++;
                lowest++;     
            }
            else if(nums[current]==1){
                current++;
            }
            else if(nums[current]==2){
                temp=nums[current];
                nums[current]=nums[highest];
                nums[highest]=temp;
                highest--;
            }
        }
        for(int ele:nums) {
        	System.out.print(ele+" ");
        }
	}

}
