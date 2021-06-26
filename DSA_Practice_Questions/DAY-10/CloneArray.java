
// Array of Names , Clone this Array and it contains all capital names
//input: [“amit”,”ram”]
//output :[“AMIT”,”RAM”]

public class CloneArray {

	static String[] clone(int index,String[] str,String[] clonearr) {
		if(str.length==index) {
			return clonearr;
		}
		String temp=str[index].toUpperCase();
		clonearr[index]=temp;
		return clone(index+1, str,clonearr);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str={"amit","ram"};
		String[] clonearr=new String[str.length];
		String[] arr=clone(0, str,clonearr);

		String c=String.join(",",arr);
		System.out.println(c);
	}

}
