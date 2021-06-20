
public class AnagramPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S="geeksogeeks";
		 char arr[]=S.toCharArray();
		 int countarr[]=new int[256];
		 int oddcount=0;
		 for(int i=0;i<arr.length;i++){
		      countarr[arr[i]]++;
		      if(countarr[arr[i]]%2!=0){
		          oddcount++;
		      }
		      else{
	           oddcount--;
	           }
		  }
		  if(oddcount==1||oddcount==0){
		      System.out.println("Palindrome");
		  }
		  else{
		      System.out.println("Not a Palindrome");
	    }
	}	
}

