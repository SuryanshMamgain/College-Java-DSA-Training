//Given an integer array A that contains only integers 0 and 1. Write a function to sort this array. Find a solution which scans the array only once. Don't use extra array.
//You need to change in the given array itself. So no need to return or print anything.
//Input format :
//Sample Input :
//0 1 1 0 1 0 1
//
//Sample Output :
//0 0 0 1 1 1 1

public class SortFuction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {0,1,1,0,1,0,1};
		int current=0;

		int high=nums.length-1;
		while(current<=high) {
			if(nums[current]==0) {
				current++;

			}
			else if(nums[current]==1) {
				int temp=nums[current];
				nums[current]=nums[high];
				nums[high]=temp;
				high--;
			}
		}
		for(int ele:nums) {
			System.out.print(ele+" ");
		}
	}

}
