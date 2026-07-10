class Solution {
    /**
     * @param {number[]} nums
     * @return {number}
     */
    maxSubArray(nums) {
        let ans = -10001
        let sum =  0 
        for(let x of nums){
            sum+=x
            ans=Math.max(ans,sum)
            if(sum<0) sum = 0
        }
        return ans 
    }
}
