
public class NumberSmallerThanCurrentNumber {
	 public static int[] smallerNumbersThanCurrent(int[] nums) {
		    int[] arr=new int[101];
		        for(int i=0;i<nums.length;i++){
		            if(arr[nums[i]]==0){
		                arr[nums[i]]=1;
		            }
		            else{
		                arr[nums[i]]+=1;
		            }
		        }
		        int sum=0;
		        for(int i=0;i<arr.length;i++){
		            sum+=arr[i];
		            arr[i]=sum;
		        }
		        for(int i=0;i<nums.length;i++){
		            if(nums[i]==0){
		                nums[i]=0;
		            }
		            else{
		                nums[i]=arr[nums[i]-1];
		            }
		        }
		        return nums;
		    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {8,1,2,2,3};
		nums=smallerNumbersThanCurrent(nums);
		for(int ele:nums) {
			System.out.print(ele+" ");
		}

	}

}
