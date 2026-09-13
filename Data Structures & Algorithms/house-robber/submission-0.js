class Solution {
    /**
     * @param {number[]} nums
     * @return {number}
     */
    rob(nums) {
        return pro(nums)
    }
}

let mem = []

function pro(nums){
    mem = new Array(nums.length + 2).fill(-1)
    return Math.max(count(0,nums),count(1,nums))
}
function count(i , nums){
    if(i >= nums.length ) return 0 
    if(mem[i]!= -1) return mem[i]
    return mem[i] = Math.max( nums[i] +count(i+2 , nums) , count(i+1 , nums))
}
