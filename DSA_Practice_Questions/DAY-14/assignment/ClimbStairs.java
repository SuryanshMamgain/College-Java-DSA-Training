//Stair climb using DP
public class ClimbStairs {
//TOP DOWN??
	static int stairClimbMemo(int curr,int target,int[] cache) {
		if(curr==target) {
			return 1;
		}
		if(curr>target) {
			return 0;
		}
		if(cache[curr]!=0) {
			return cache[curr];
		}
		int count=0;
		for(int stair=1;stair<=3;stair++) {
			count=count+stairClimbMemo(curr+stair, target, cache);
		}
		cache[curr]=count;
		return cache[curr];
	}
	
//BOTTOM UP 	
	static int stairClimbTabu(int curr,int target) {
		int[] arr=new int[target+1];
		arr[target]=1;
		for(int i=target-1;i>=0;i--) {
			int count=0;
			for(int stair=1;stair<=3&&stair+i<arr.length;stair++) {
				count=count+arr[stair+i];
			}
			arr[i]=count;
		}
		return arr[curr];
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int target=4;
		int[] cache=new int[target+1];  
		System.out.println(stairClimbMemo(0, target,cache));
		System.out.println(stairClimbTabu(0, target));
		
	}

}
