//THIS IS GEEKS FOR GEEKS PROBLEM.
import java.util.HashSet;
import java.util.Set;

public class TwoRepeatedElements {
    public static Pair twoRepeated(int arr[], int N)
    {
          int first = -1;
        int second = -1;
        Set<Integer> hash=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            int key=arr[i];
            if(hash.contains(key)){
                if(first == -1){
                   first = key;
               }else{
                  second = key; 
                  break;
               } 
                
            }else{
                hash.add(key);
            }
        }
     
        Pair p = new Pair();
        p.first =first;
        p.second = second;
        return p;
    }
    public static class Pair{
    	int first;
    	int second;
    }
	public static void main(String[] args) {
		
		Pair p =twoRepeated(new int[]{1,2,2,1}, 4);
		System.out.println(p.first+" "+p.second);
	}

}
