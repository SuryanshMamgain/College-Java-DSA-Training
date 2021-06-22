//Print this pattern:
//   1
//   23
//   456
//   78910

public class Pattern1 {
	static int printDigit(int noOfDigit,int currentDigit) {
		if(noOfDigit==0) {
			return currentDigit;
		}
		System.out.print(currentDigit);
		noOfDigit-=1;
		return printDigit(noOfDigit, currentDigit+1);
	}
	static void printRow(int noOfRows,int noOfDigit,int startDigit) {
	if(noOfRows==0) {
		return;
	}
	startDigit=printDigit(noOfDigit, startDigit);
	System.out.println();
	printRow(noOfRows-1, noOfDigit+1, startDigit);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printRow(4, 1, 1);
	}

}
