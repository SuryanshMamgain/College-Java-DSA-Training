
public class CoinChange {
	//recursion approach to print all the combinations//
	static void coinchange(int[] coins,int index,int target,String result) {
		if(target==0) {
			System.out.println(result);
			return;
		}
		for(int i=index;i<coins.length;i++) {
			if(target>=coins[i]) {
				coinchange(coins, i, target-coins[i], result+coins[i]);
			}
		}
	}
	
//DP approach to count coins Combinations//
	
	static int coinchangecountTabu(int[] coins,int targetamount) {
		int cache[]=new int[targetamount+1];
		cache[0]=1;
		for(int coin:coins) {
			for(int i=1;i<cache.length;i++) {
				if(i>=coin) {
				cache[i]+=cache[i-coin];
				}
			}	
		}
		return cache[targetamount];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] coins= {2,3,5,6};
		int target=10;
		coinchange(coins,0,target,"");
		System.out.println("Count: "+coinchangecountTabu(coins, target));
	}

}
