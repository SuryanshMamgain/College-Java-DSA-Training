
public class CoinChange {
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] coins= {2,3,5,6};
		int target=10;
		coinchange(coins,0,target,"");
	}

}
