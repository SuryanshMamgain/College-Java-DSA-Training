//Convert String "2*pi+3*pi+4*pi" to "2*3.14+3*3.14+4*3.14"


public class ChangeString {
	static String str="2*pi+3*pi+4*pi";
	static String pi(int index) {
		if(index==str.length()) {
			return "";
		}
		if(index+1<str.length() && str.charAt(index)=='p' && str.charAt(index+1)=='i') {//for checking "pi"
			return "3.14"+pi(index+2);//concat 3.14 and skip "pi" 
		}
		return str.charAt(index)+pi(index+1);//for rest of characters
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(pi(0));
	}

}
