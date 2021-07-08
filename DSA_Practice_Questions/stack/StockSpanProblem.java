import java.util.Stack;

public class StockSpanProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr={10,20,30,40};
		Stack<Integer> stack=new Stack<>();
		stack.push(0);
		System.out.print(1);
		for(int i=1;i<arr.length;i++) {
			while(!stack.isEmpty()&&arr[stack.peek()]<=arr[i]) {
				stack.pop();
			}
			System.out.print(" "+(stack.isEmpty()?i+1:i-stack.peek()));
			stack.push(i);
		}
	}

}
