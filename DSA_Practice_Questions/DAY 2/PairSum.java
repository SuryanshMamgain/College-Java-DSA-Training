
//THIS IS LEETCODE PROBLEM-1.
import java.util.HashMap;

public class PairSum {

	public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hash=new HashMap<>();
        int[] a=new int[2];
        for(int i=0;i<nums.length;i++){ 
            if(hash.get(nums[i])!=null){
                a[0]=hash.get(nums[i]);
                a[1]=i;
               return a;
            }
            int index=target-nums[i];
            hash.put(index,i);
        }
        return null;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {2,7,11,15};
		int[] b=new int[2];
		b=twoSum(nums,9);
		for(int x:b) {
			System.out.println("index: "+x);
		}
	}

}
