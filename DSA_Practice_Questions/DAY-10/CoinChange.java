//Coin Change Problem
//
//10 Rs Amount Need to Pay
//
//Coins - 2 , 3, 5, 6

import java.util.ArrayList;

public class CoinChange {

	static ArrayList<String> changeCoin(int[] coins,int target,int currcoin){
		if(currcoin==target) {
			ArrayList<String> list=new ArrayList<>();
			list.add("");
			return list;
		}
		
		ArrayList<String> result=new ArrayList<>();
		for(int coin:coins) {
			int newval=currcoin+coin;
			if(currcoin>target) {
				break;
			}
			ArrayList<String> temp=changeCoin(coins, target, newval);
			for(String val:temp) {
				result.add(val+coin);
			}
		}
		
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] coins= {2,3,5,6};
		System.out.println(changeCoin(coins,10,0));
	}

}
