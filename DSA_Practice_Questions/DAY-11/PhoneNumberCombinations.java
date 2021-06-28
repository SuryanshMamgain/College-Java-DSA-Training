import java.util.ArrayList;

public class PhoneNumberCombinations {

	static String[] keyPadArray= {"",".+-","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
	static ArrayList<String> keyPad(String phoneNumber){
		if(phoneNumber.length()==0) {
			ArrayList<String> list=new ArrayList<>();
			list.add("");
			return list;
		}
		char first=phoneNumber.charAt(0);
		String remaining=phoneNumber.substring(1);
		int index=first-'0';
		String keyPadKey=keyPadArray[index];
		ArrayList<String> result=new ArrayList<>();
		for(int i=0;i<keyPadKey.length();i++) {
			char currchar=keyPadKey.charAt(i);
			ArrayList<String> temp=keyPad(remaining);
			for(String t:temp) {
				result.add(t+currchar);
			}
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String phoneNumber="45";
		System.out.println(keyPad(phoneNumber));
	}

}
