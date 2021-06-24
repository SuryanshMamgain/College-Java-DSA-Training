//DiceGame


import java.util.ArrayList;

public class DiceGame {
	static ArrayList<String> diceRoll(int currentval,int endval){
		if(currentval==endval) {
			ArrayList<String> list=new ArrayList<>();
			list.add("");
			return list;
		}
		if(currentval>endval) {
			ArrayList<String> list=new ArrayList<>();
			return list;
		}
		ArrayList<String> result=new ArrayList<>();
		for(int dice=1;dice<=6;dice++) {
			int newval=currentval+dice;
			ArrayList<String> temp=diceRoll(newval, endval);
			for(String ele:temp) {
				result.add(dice+ele);
			}
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(diceRoll(0,10));
	}

}
