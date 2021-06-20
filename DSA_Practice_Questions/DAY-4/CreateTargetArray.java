//THIS IS LEETCODE PROBLEM-1398.

import java.util.ArrayList;
import java.util.List;

public class CreateTargetArray {
	public static void main(String[] args) {
	int[] nums= {0,1,2,3,4};
	int[] index= {0,1,2,2,1};
	//USING ARRAYLIST//
//	List<Integer> target=new ArrayList<>();
//    for(int i=0;i<nums.length;i++){
//        target.add(index[i],nums[i]);
//    }
//    int[] a=new int[nums.length];
//    for(int ele:target){
//    	System.out.print(ele+" ");
//    }
	
	//////////////////////////////////////////////////////////////////////////////////
	//ANOTHER METHOD//
	//////////////////////////////////////////////////////////////////////////////////
    int[] target=new int[nums.length];
    for(int i=0;i<nums.length;i++){
        target[i]=-1;
    }
    for(int i=0;i<nums.length;i++){
        if(target[index[i]]==-1){
            target[index[i]]=nums[i];
        }
        else{
            for(int j=nums.length-1;j>index[i];j--){
                target[j]=target[j-1];
            }
            target[index[i]]=nums[i];
        }
    }
  for(int ele:target){
	System.out.print(ele+" ");
}

}
}
