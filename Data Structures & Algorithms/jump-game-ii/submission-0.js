class Solution {
    /**
     * @param {number[]} nums
     * @return {number}
     */
    jump(nums) {
        let jumps = 0
        let currEnd = 0
        let far = 0

        for(let i = 0 ;i< nums.length -1 ;i++){
            far = Math.max(far,i+nums[i])
            if(i==currEnd){
                jumps++
                currEnd = far
                if(currEnd>=nums.length -1 ) break 
            }

        }
        return jumps 
    }
}
