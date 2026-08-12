class Solution {
    static List<String> ans ;
    public List<String> generateParenthesis(int n) {
         ans = new ArrayList<>();
         solve(n,0,0,"");
         return ans ;
    }
    private static void solve(int n , int open , int close , String curr){
        if(curr.length() == 2*n){
             ans.add(curr);
             return ;
        }
        if(open < n ){
            solve(n,open+1,close , curr + "(");
        }
        if(close < open){
            solve(n,open,close+1,curr+")");
        }
    }
}
