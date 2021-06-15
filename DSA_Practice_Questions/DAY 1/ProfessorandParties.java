//THIS IS GEEKS FOR GEEKS PRACTICE PROBLEM
//https://practice.geeksforgeeks.org/problems/professor-and-parties2000/1#

import java.util.HashSet;
import java.util.Set;

public class ProfessorandParties {
	
	public static String PartyType( long a[])
    {
        // Your code goes here
        int len1=a.length;
        Set<Long> set = new HashSet<>();
        for(Long ele:a){
            set.add(ele);
        }
        int len2=set.size();
        if(len1==len2){
            return "GIRLS";
        }
        else{
            return "BOYS";
        }
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long[] arr= {1, 2, 3,3, 4, 7};
		System.out.println(PartyType(arr));
		}

}
