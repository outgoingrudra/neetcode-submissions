class Solution {
    /**
     * @param {number[]} nums
     * @return {number[]}
     */
    productExceptSelf(nums) {
       let mul = 1
       let zeros = 0
       for (let i of nums){
        if(i==0) {
            zeros++
            continue ;
        }
         mul *= i
       }
       let ans = []
       for(let i  = 0;i< nums.length ;i++){
           if(zeros>1){
               ans.push(0)
           }
           else if(zeros==1){
            if(nums[i]==0){
                 ans.push(mul)
            }
            else ans.push(0)
           }
           else{
                    if(nums[i]==0){
                      ans.push(mul)
                   }
                  else{
                    ans.push(mul/nums[i])
                 }
           }
       }
       return ans 
    }
}
