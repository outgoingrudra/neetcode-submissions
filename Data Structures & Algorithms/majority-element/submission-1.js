class Solution {
    /**
     * @param {number[]} nums
     * @return {number}
     */
    majorityElement(nums) {
         let el = 0;
       let cnt = 0;
       for(let x of nums){
        if(cnt==0){
            el = x;
            cnt =1;
        }
        else if(x== el){
            cnt++;
        }
        else cnt--;
       }
       return el ;
    }
}
