//Write a Recursive Function , Function take input as an array (List of Numbers) we need to return the product of all the numbers in the list.
//input-{1,2,3,4,5}
//output-120

public class ProductOfArray {
	static int product(int[] arr,int index) {
		if(index==arr.length) {
			return 1;
		}
		return arr[index]*product(arr, index+1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5};
		System.out.println(product(arr,0));
	}

}
