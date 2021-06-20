//THIS IS LEETCODEPROBLEM-387.

import java.util.LinkedHashMap;

public class FirstUniqueCharacterInAString {
    public static int firstUniqChar(String s) {
        LinkedHashMap<Character,Integer> hash=new LinkedHashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char key=s.charAt(i);
            if(hash.containsKey(key)){
                hash.put(key,hash.get(key)+1);
            }
            else{
                   hash.put(key,1);
               }       
        }
        for(int i=0;i<s.length();i++){
            if(hash.get(s.charAt(i))==1){
                return i;
            }
            
        }
        return -1;
   }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="leetcode";
		System.out.println(firstUniqChar(s));

	}

}
