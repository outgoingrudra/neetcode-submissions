class Solution {
    /**
     * @param {string[]} strs
     * @return {string}
     */
    longestCommonPrefix(strs) {
        let ans = ""
        for(let x  = 0 ; x < strs[0].length ; x++){
            for(let str of strs){
                if(strs[0][x] != str[x]) return ans
            }
            ans += strs[0][x]
        }
        return ans 
    }
}
