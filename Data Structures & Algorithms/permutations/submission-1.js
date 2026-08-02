class Solution {
    /**
     * @param {number[]} nums
     * @return {number[][]}
     */
    ans =[]

    permute(nums) {
        this.ans= []
        let used =new Array(nums.length).fill(false)
        this.solve(nums,[],used)
        return this.ans
    }
    solve = function(nums , curr,used){
        if(curr.length == nums.length){
            this.ans.push([...curr])
            return
        }
        for(let i = 0 ; i < nums.length ;i++){
            if(used[i]) continue

           curr.push(nums[i])
           used[i]=  true 
            this.solve(nums,curr, used);
            curr.pop()
            used[i]=false 
        }
    }
}
