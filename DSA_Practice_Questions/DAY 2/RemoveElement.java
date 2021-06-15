//THIS IS LEETCODE PROBLEM-27.

public class RemoveElement {

    public static int removeElement(int[] nums, int val) {
        int len=nums.length;
        int j=0;
        for(int i=0;i<len;i++){  
            if(nums[i]!=val){   
                nums[j]=nums[i];
                j++;
            }
            else{
                continue;
            }
        }  
         return j; 
      }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {0,1,2,2,3,0,4,2};
		System.out.println(removeElement(nums,2));

	}

}
