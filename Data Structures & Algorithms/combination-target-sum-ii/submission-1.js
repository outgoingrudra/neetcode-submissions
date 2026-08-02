class Solution {
    /**
     * @param {number[]} candidates
     * @param {number} target
     * @return {number[][]}
     */
    ans =[]
    combinationSum2(nums, target) {
             nums.sort((a,b)=> a-b)
             this.ans =[]
             this.solve(nums,0,target,[ ])
             return this.ans

    }
    solve =  function(nums,idx,target,curr){
        if(target==0){
            this.ans.push([...curr])
            return
        }

        for(let i = idx ; i < nums.length ;i++){
            if(i!=idx && nums[i]==nums[i-1]) continue 
            if(nums[i]>target) break 
            curr.push(nums[i])
            this.solve(nums,i+1,target - nums[i],curr)
            curr.pop()
        }
    }
}
