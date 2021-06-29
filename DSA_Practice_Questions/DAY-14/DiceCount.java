//dice count using DP
public class DiceCount {
//recursion//
	static int countdice(int curr,int target) {
		if(curr==target) {
			return 1;
		}
		if(curr>target) {
			return 0;
		}
		int count=0;
		for(int dice=1;dice<=6;dice++) {
			count=count+countdice(curr+dice, target);
		}
		return count;
	}
//TOP DOWN//	
	static int countWaysMemo(int curr,int target,int[] cache) {
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
		for(int dice=1;dice<=6;dice++) {
			count=count+countWaysMemo(curr+dice, target, cache);
		}
		cache[curr]=count;
		return cache[curr];
	}
//BOTTOM UP//
	static int countWaysTabu(int curr,int target) {
		int[] arr=new int[target+1];
		arr[target]=1;
		for(int i=target-1;i>=0;i--) {
			int count=0;
			for(int dice=1;dice<=6&&dice+i<arr.length;dice++) {
				count=count+arr[dice+i];
			}
			arr[i]=count;
		}
		return arr[curr];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int target=10;
		int[] cache=new int[target+1];
		System.out.println(countdice(0,target));
		System.out.println(countWaysMemo(0,target,cache));
		System.out.println(countWaysTabu(0,10));
	}

}
