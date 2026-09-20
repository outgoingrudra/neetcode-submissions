class Solution {
    List<String> ans  = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        solve(n , 0 , 0 ,"");
        return ans ;
        
    }
    private void solve(int n , int open , int close , String s){
        if(s.length() ==  n*2) {
            ans.add(new String(s));
        }

        if(open < n){
             solve(n , open +1 , close , s+"(");
        }
        if(close < open){
              solve(n , open , close +1  , s+")");
           
        }
    }
}
