class Solution {
    /**
     * @param {number[]} nums
     * @return {number}
     */
    longestConsecutive(nums) {
        let set = new Set()
        for(let x of nums) {
                 set.add(x)
        }
        let ans =0
        for(let x of set){
            if(set.has(x-1)) continue
            let cnt = 1
            while(set.has(x+1)){
                cnt++
                x++
            }
            ans = ans> cnt ? ans : cnt
        }
        return ans 
    }
}
