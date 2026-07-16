class Solution {
    /**
     * @param {number[]} nums
     * @return {number}
     */
    singleNumber(nums) {
        let ans = 0
        for (let x of nums) ans ^= x 
        return ans 
    }
}
