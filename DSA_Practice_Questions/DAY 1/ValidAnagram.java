////THIS IS LEETCODE PROBLEM-242.
import java.util.Arrays;

public class ValidAnagram {

	 public static boolean isAnagram(String s, String t)
	    {
	        
	        char[] c1= s.toCharArray();
	        char[] c2= t.toCharArray();
	        Arrays.sort(c1);
	        Arrays.sort(c2);

	        if(c1.length != c2.length)
	        {
	            return false;
	        }
	        for(int i=0;i<c1.length;i++)
	        {
	            if(c1[i]!=c2[i])
	            {
	                return false;
	            }
	        }
	        return true;
	    } 
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="anagram";
		String t="nateram";
		System.out.println(isAnagram(s,t));
	}

}
