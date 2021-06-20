//THIS IS LEETCODE PROBLEM-1398.

import java.util.ArrayList;
import java.util.List;

public class CreateTargetArray {
	public static void main(String[] args) {
	int[] nums= {0,1,2,3,4};
	int[] index= {0,1,2,2,1};
	List<Integer> target=new ArrayList<>();
    for(int i=0;i<nums.length;i++){
        target.add(index[i],nums[i]);
    }
    int[] a=new int[nums.length];
    for(int ele:target){
    	System.out.print(ele+" ");
    }

}
}
