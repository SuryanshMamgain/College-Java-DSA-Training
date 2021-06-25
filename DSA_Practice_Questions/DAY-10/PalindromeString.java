//Palindrome String sing recursion
//input-"nitin"
//output-true
public class PalindromeString {
	static boolean isPalindrome(String str,int index,int length) {

		if(length==0||length==1) {
			return true;
		}
		if(str.charAt(index)!=str.charAt(length)) {
			return false;
		}
		return isPalindrome(str, index+1, length-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="NAMAN";
		System.out.println(isPalindrome(str, 0, str.length()-1));
	}

}
