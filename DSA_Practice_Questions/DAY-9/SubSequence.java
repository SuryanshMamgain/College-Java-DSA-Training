//Input-"Suru"
//Output-[ , S , u , Su , r , Sr , ur , Sur , u , Su , uu , Suu , ru , Sru , uru , Suru ]

import java.util.ArrayList;

public class SubSequence {
	static ArrayList<String> getSubSequences(String str){
		if(str.length()==0) {
			ArrayList<String> emptyString=new ArrayList<>();
			emptyString.add("");
			return emptyString;
		}
		char currentChar=str.charAt(0);
		String remainingString=str.substring(1);
		ArrayList<String> result=new ArrayList<>();
		ArrayList<String> temp=getSubSequences(remainingString);
		for(String ele:temp) {
			result.add(ele);
			result.add(currentChar+ele);
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> results= getSubSequences("amit");
		System.out.println(results);
	}

}
