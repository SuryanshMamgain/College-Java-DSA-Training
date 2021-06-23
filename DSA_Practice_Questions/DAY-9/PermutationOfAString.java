//Permutation of a string
//input-"abc"
//output-[abc, bac, bca, acb, cab, cba]

import java.util.ArrayList;

public class PermutationOfAString {
		static ArrayList<String> getPermutation(String str){
			if(str.length()==0) {
				ArrayList<String> emptyString=new ArrayList<>();
				emptyString.add("");
				return emptyString;
			}
			char currentChar=str.charAt(0);
			String remainingString=str.substring(1);
			ArrayList<String> result=new ArrayList<>();
			ArrayList<String> temp=getPermutation(remainingString);
			for(String ele:temp) {
				for(int i=0;i<=ele.length();i++) {
					StringBuffer sb=new StringBuffer(ele);
					sb.insert(i,currentChar);
					result.add(sb.toString());
				}
			}	
		
			return result;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> results= getPermutation("abc");
		System.out.println(results);
	}

}
