import java.util.Stack;

public class LargestRectangularAreaInHistogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] bars= {0,2,0};
		int MaxArea=0;
		Stack<Integer> stack = new Stack<>();
		stack.push(-1);
		for(int i=0;i<bars.length;i++) {
			while(stack.peek()!=-1&&bars[stack.peek()]>=bars[i]) {
				int topelement=stack.pop();
				int right=i;
				int left=stack.peek();
				MaxArea=bars[topelement]*((right-left)-1);
			}
			stack.push(i);
		}
		while(stack.peek()!=-1) {
			MaxArea=Math.max(MaxArea,bars[stack.pop()]*((bars.length-stack.peek())-1));
		}
		System.out.println("maximum area is: "+MaxArea);
	}

}
