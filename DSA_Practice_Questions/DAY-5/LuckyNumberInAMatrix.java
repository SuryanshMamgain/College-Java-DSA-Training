//THIS IS GEEKS FOR GEEKS PROBLEM
//Given a m * n matrix of distinct numbers, return all lucky numbers in the matrix in any order.
//A lucky number is an element of the matrix such that it is the minimum element in its row and maximum in its column.
//EXAMPLE:
//Input: matrix = [[3,7,8],[9,11,13],[15,16,17]]
//Output: [15]
//Explanation: 15 is the only lucky number since it is the minimum in its row and the maximum in its column.

import java.util.HashSet;

public class LuckyNumberInAMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix= {
				{1,10,4,2},
				{9,3,8,7},
				{15,16,17,12}
	};
		if(matrix.length==0||matrix.length==1) {
			System.out.println(matrix);
		}
		int rowlen=matrix.length;
		int collen=matrix[0].length;

		int[] row=new int[rowlen];
		int[] col=new int[collen];
		for(int i=0;i<rowlen;i++) {
			row[i]=Integer.MAX_VALUE;
		}
		for(int i=0;i<collen;i++) {
			col[i]=Integer.MIN_VALUE;
		}
		for(int i=0;i<rowlen;i++) {
			for(int j=0;j<collen;j++) {
				row[i]=Math.min(row[i], matrix[i][j]);
			}
		}
		for(int i=0;i<collen;i++) {
			for(int j=0;j<rowlen;j++) {
				col[i]=Math.max(col[i], matrix[j][i]);
			}
		}

		HashSet<Integer> hash=new HashSet<Integer>();
		for(int i=0;i<rowlen;i++) {
			hash.add(row[i]);
		}
		for(int j=0;j<collen;j++) {
			if(hash.contains(col[j])) {
				System.out.println(col[j]);
				break;
			}	
		}
}
}
