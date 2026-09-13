class Solution {
    /**
     * @param {number} n
     * @return {number}
     */
    climbStairs(n) {
        return pro(n)
    }
}

let mem = []
function pro(n){
      mem = new Array(n+2).fill(-1)
      return count(0,n)
}

function count(i , n){
    if(i==n) return 1
    if(i > n) return 0 
    if(mem[i]!=-1) return mem[i]
    return  mem[i]=  count(i+1,n) + count(i+2,n)
}