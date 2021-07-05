import java.util.ArrayList;
import java.util.List;
//THIS IS LEETCODE PROBLEM-22
//Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
//Input: n = 3
//Output: ["((()))","(()())","(())()","()(())","()()()"]

class Parenthesis {
     public static void generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        generateParenthesis(n, n, new StringBuilder(), ans);
        System.out.println(ans);
    }
    private static void generateParenthesis(int open,int close,StringBuilder str,List<String> ans){
        if(open==0&&close==0){
            ans.add(str.toString());
            return;
        }
        if(open!=0){
            str.append("(");
            generateParenthesis(open-1,close,str,ans);
            str.deleteCharAt(str.length()-1);
        }
        if(close>open){
            str.append(")");
            generateParenthesis(open,close-1,str,ans);
            str.deleteCharAt(str.length()-1);
        }
        return;
    }

	public static void main(String[] args) {
		int n=3;
		generateParenthesis(n);
}
}