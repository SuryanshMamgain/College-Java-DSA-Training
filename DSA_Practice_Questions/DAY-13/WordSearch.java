//THIS IS LEETCODE PROBLEM-79.
public class WordSearch {

	static char board[][]= {
							{'A','B','C','E'},
							{'S','F','C','S'},
							{'A','D','E','E'},
							};
	static boolean searchword(int i,int j,int index,String word,char[][] board) {
		if(index==word.length()) {
			return true;
		}
		if(i<0||i>=board.length||j<0||j>=board.length||word.charAt(index)!=board[i][j]) {
			return false;
		}
		if(
				searchword(i+1,j,index+1,word,board)||
				searchword(i-1,j,index+1,word,board)||
				searchword(i,j+1,index+1,word,board)||
				searchword(i,j-1,index+1,word,board)
		  ) {
			return true;
		}
			return false;
	}
	
	static boolean exist(char[][] borad,String word) {
		int r=board.length;
		int c=board[0].length;
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				if(word.charAt(0)==board[i][j]&&searchword(i,j,0,word,board)) {
					return true;
				}
			}
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		String word="ABCB";
		System.out.println(exist(board,word));
	}

}
