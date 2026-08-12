class Solution {
    /**
     * @param {number} n
     * @return {string[]}
     */
    generateParenthesis(n) {
        return sol(n)
    }
}

let ans = []
function sol(n){
    ans = []
    solve(n,0,0,"")
    return ans
}

function solve( n ,  open ,  close ,  curr){
        if(curr.length == 2*n){
             ans.push(curr);
             return ;
        }
        if(open < n ){
            solve(n,open+1,close , curr + "(");
        }
        if(close < open){
            solve(n,open,close+1,curr+")");
        }
    }