class Solution {
    /**
     * @param {number} n
     * @return {number}
     */
    climbStairs(n) {
        let mem = new Array(n+1)
        mem.fill(-1)
        return solve(n,mem)
    }
}


function solve(n, mem){
    if(n==0 || n== 1) return 1
    if(mem[n]!=-1) return mem[n]

    mem[n] = solve(n-1,mem) + solve(n-2,mem)
    return mem[n]
}