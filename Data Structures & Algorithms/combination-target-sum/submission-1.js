class Solution {
    /**
     * @param {number[]} nums
     * @param {number} target
     * @returns {number[][]}
     */
    ans = [];
    combinationSum(nums, target) {
         this.ans = []
         this.solve(nums,0,target, [])
         return this.ans
    }
    solve = function (nums , idx , target , curr){
          if(target==0){
            this.ans.push([...curr])
            return
          }
          if(target < 0 || nums.length == idx) return

          curr.push(nums[idx])
          this.solve(nums,idx,target-nums[idx],curr)
          curr.pop()
          this.solve(nums,idx+1,target,curr)
    }
}
