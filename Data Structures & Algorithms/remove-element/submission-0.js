class Solution {
    /**
     * @param {number[]} nums
     * @param {number} val
     * @return {number}
     */
    removeElement(nums, val) {
         let ele  = nums.filter(n => n!= val)
         for(let x  = 0 ; x < ele.length ; x++){
               nums[x] = ele[x]
         }
        return ele.length 
    }
}
