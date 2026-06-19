class Solution {
    /**
     * @param {number[]} nums
     * @return {number[][]}
     */
    threeSum(nums) {
        let n = nums.length 
        nums.sort((a,b)=> (a-b))
        let ans = []
        let i ,j, k
        for(i =0;i<n-2;i++){
             if(i!=0 && nums[i]== nums[i-1]) continue 
             j = i+1
             k= n-1
             while(j<k){
                 let sum = nums[i]+nums[j]+nums[k]
                 if(sum==0){
                    ans.push([nums[i],nums[j],nums[k]])
                    j++
                    k--

                    while(j<k && nums[j]==nums[j-1]) j++
                    while(j<k && nums[k]==nums[k+1]) k--
                 }
                 else if(sum<0) j++
                 else k--
             }
        }
        return ans 


    }
}
