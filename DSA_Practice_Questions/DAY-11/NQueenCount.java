//N-Queen Problem

public class NQueenCount {
	static boolean isSafePlace(boolean chessBoard[][],int currRow,int col) {
		//check-row,column,diagonal
		for(int i=currRow;i>=0;i--) { //check in above row
			if(chessBoard[i][col]) {
				return false;
			}
		}
		for(int i=currRow,j=col;i>=0&&j>=0;i--,j--) {//check in left diagonal
			if(chessBoard[i][j]) {
				return false;
			}
		}
		for(int i=currRow,j=col;i>=0&&j<chessBoard.length;i--,j++) {//check in right diagonal
			if(chessBoard[i][j]) {
				return false;
			}
		}
		return true;
	}

	static int countQueenPlacement(boolean chessBoard[][],int currRow) {
		int count=0;
		if(currRow==chessBoard.length) {//termination case
			return 1;
		}
		for(int col=0;col<chessBoard[currRow].length;col++) {//current row and traverse all cells
			if(isSafePlace(chessBoard,currRow,col)) {//check for availability before placing queen
				chessBoard[currRow][col]=true;//queen place
				count=count+countQueenPlacement(chessBoard, currRow+1);//recursion
				chessBoard[currRow][col]=false;//undo
			}
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean chessBoard[][]=new boolean[4][4];
		int count=countQueenPlacement(chessBoard,0);
		System.out.println(count);
	}

}
