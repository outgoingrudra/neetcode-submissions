class Solution {
    /**
     * @param {number[]} cost
     * @return {number}
     */
    minCostClimbingStairs(cost) {
        return pro(cost)
    }
}

let mem = []

function pro(cost){
    mem = new Array(cost.length + 2).fill(-1)
    return Math.min(solve(0,cost), solve(1,cost))
}

function solve(i , cost){
    if(i >= cost.length ) return  0
    if(mem[i]!=-1) return mem[i]

    return mem[i] =cost[i]+  Math.min(solve(i+1,cost),solve(i+2,cost))
}