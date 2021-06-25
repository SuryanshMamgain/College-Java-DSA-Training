//INPUT-xxyy
//OUTPUT-x*xy*y


public class ChangeString2 {
	static String str="xxyy";
	static String change(int index) {
		if(str.length()==index) {
			return "";
		}
		if(index<str.length()-1&&str.charAt(index)==str.charAt(index+1)) {
			return str.charAt(index)+"*"+change(index+1);
		}
		return str.charAt(index)+change(index+1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(change(0));
	}

}
