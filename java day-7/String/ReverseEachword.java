import java.util.Scanner;

public class ReverseEachword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		String reverseString="";
		System.out.println("Enter a string:");
		String str=scanner.nextLine();
		String str2[]=str.split("\\s");
		for(String word:str2) {
			StringBuilder sb=new StringBuilder(word);
			sb.reverse();
			reverseString+=sb.toString()+" ";
		}
		System.out.println(reverseString);
	}
}
