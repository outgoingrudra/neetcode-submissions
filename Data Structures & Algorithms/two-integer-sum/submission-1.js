class Solution {
    /**
     * @param {number[]} nums
     * @param {number} target
     * @return {number[]}
     */
    twoSum(nums, target) {
        let mpp = new Map()
        for(let i = 0 ;i< nums.length ;i++){
            let diff = target - nums[i]
            if(mpp.has(diff)){
                let j = mpp.get(diff)
                return i>j ?  [j,i] : [i,j]

            }
            mpp.set(nums[i],i)
        }
        return [-1,-1]
    }
}
