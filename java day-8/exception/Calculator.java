import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
	Scanner scanner=new Scanner(System.in);
	int first_number;
	int second_number;
	int result;
	public void firstnum() {
		try{
			System.out.println("Enter first no.: ");
			first_number=scanner.nextInt();	
		}
		catch(InputMismatchException e){
			System.out.println("Number must be between 0-9");
			scanner.nextLine();
			firstnum();
		}
	}
	public void secondnum(String msg) {
		if (msg==null){
			msg="Number must be between 0-9";
		}
		try{
			System.out.println("Enter second no.: ");
			second_number=scanner.nextInt();
		}
		catch(InputMismatchException e){
			System.out.println(msg);
			scanner.nextLine();
			secondnum(msg);
			divide();
		}
	}
	void divide() {
		try {
			result=first_number/second_number;
		}
		catch(ArithmeticException e){
			System.out.println("You cannot divide a number by ZERO");
			secondnum("Number must be between 1-9");
		}
	}
	void print(){
		System.out.println("Result: "+result);
		
	}
}
