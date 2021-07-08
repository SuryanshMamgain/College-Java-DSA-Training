import java.util.Stack;

public class PreviousGreatestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr={40,12,45,67,23,56,33,89,56,90};
		Stack<Integer> stack=new Stack<>();
		stack.push(arr[0]);
		System.out.print(-1);
		for(int i=1;i<arr.length;i++) {
			while(!stack.isEmpty()&&stack.peek()<=arr[i]) {
				stack.pop();
			}
			System.out.print(" "+(stack.isEmpty()?-1:stack.peek()));
			stack.push(arr[i]);
		}

	}

}
