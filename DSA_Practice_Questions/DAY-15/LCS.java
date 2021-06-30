
public class LCS {
//Normal Recursion//
	static int lcsCount(String s1,String s2) {
		if(s1.length()==0||s2.length()==0) {
			return 0;
		}
		int count=0;
		if(s1.charAt(0)==s2.charAt(0)) {
			count=1+lcsCount(s1.substring(1), s2.substring(1));
		}
		else {
			int result1=lcsCount(s1.substring(1), s2);
			int result2=lcsCount(s1, s2.substring(1));
			count=Math.max(result1, result2);
		}
			
		return count;
		
	}
//TOP DOWN//	
	static int lcsCountMemo(String s1,String s2,int m,int n,int[][] cache) {
		if(m==0||n==0) {
			return 0;
		}
		if(cache[m-1][n-1]!=0) {
			return cache[m-1][n-1];
		}
		if(s1.charAt(m-1)==s2.charAt(n-1)) {
			cache[m-1][n-1]=1+lcsCountMemo(s1, s2, m-1, n-1, cache);
		}
		else {
			int result1=lcsCountMemo(s1, s2, m-1, n, cache);
			int result2=lcsCountMemo(s1, s2, m, n-1, cache);
			cache[m-1][n-1]=Math.max(result1, result2);
		}
		return cache[m-1][n-1];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="ABCDGH";
		String s2="AEDFHR";
		int[][] cache=new int[s1.length()][s2.length()];
		System.out.println(lcsCount(s1,s2));
		System.out.println(lcsCountMemo(s1, s2, s1.length(), s2.length(),cache));
	}

}
