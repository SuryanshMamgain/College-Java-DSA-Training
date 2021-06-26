//ATOI using recursion

public class ATOI {
	static int convertToInt(String str,int len) {
		
		if(len==0) {
			return str.charAt(0)-'0';
		}

		return convertToInt(str, len-1)*10+str.charAt(len)-'0';
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="12334455";
		System.out.println(convertToInt(str, str.length()-1));
	}

}
