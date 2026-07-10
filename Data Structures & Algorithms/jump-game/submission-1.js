class Solution {
    /**
     * @param {number[]} nums
     * @return {boolean}
     */
    canJump(nums) {
        let far = 0 
       for(let i = 0 ; i < nums.length ;i++){
        if(i>far) return false ;
        far = Math.max(far,i+nums[i]);
    }
    return true ;
    }
}
