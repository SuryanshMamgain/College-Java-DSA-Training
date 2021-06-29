//FIBONACCI USING DP
public class Fibonacci {
//TOP DOWN//
	static int fibWithMemo(int n,int[] cache) {
		if(n==0||n==1) {
			return n;
		}
		if(cache[n]!=0) {
			return cache[n];
		}
		int first=fibWithMemo(n-1,cache);
		int second=fibWithMemo(n-2,cache);
		int sum=first+second;
		cache[n]=sum;
		return cache[n];
	}
//BOTTOM UP//	
	static int fibWithTabulation(int n,int[] arr) {
		arr[0]=0;//n-2
		arr[1]=1;//n-1
		for(int current=2;current<arr.length;current++) {
			arr[current]=arr[current-1]+arr[current-2];
		}
		return arr[n];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fib=10;
		int[] cache=new int[fib+1];
		System.out.println(fibWithMemo(fib,cache));
		System.out.println(fibWithTabulation(fib,cache));
	}

}
