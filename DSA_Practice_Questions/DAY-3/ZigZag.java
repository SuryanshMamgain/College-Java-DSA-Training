//THIS IS GEEKS FOR GEEKS PROBLEM
//https://practice.geeksforgeeks.org/problems/convert-array-into-zig-zag-fashion1638/1#
public class ZigZag {

	public static int[] zigZag(int arr[], int n) {

	    int temp=0;
	    boolean flag=true;
	    for(int i=0;i<arr.length-1;i++){
	        if(flag==true){
	            if(arr[i]>arr[i+1]){
	                temp=arr[i];
	                arr[i]=arr[i+1];
	                arr[i+1]=temp;
	            }
	        }
	        else if(arr[i]<arr[i+1]){
	                temp=arr[i];
	                arr[i]=arr[i+1];
	                arr[i+1]=temp;
	        }
	        flag=!flag;
	    }
	    return arr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {4, 3, 7, 8, 6, 2, 1};
		int[] newarr=new int[arr.length];
		newarr=zigZag(arr,7);
		for(int ele:newarr) {
			System.out.print(ele+" ");
		}
	}

}
