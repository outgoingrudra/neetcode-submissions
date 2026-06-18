class Solution {
    /**
     * @param {string[]} strs
     * @returns {string}
     */
    encode(strs) {
       let  ans = ""
        for(let s of strs){
            ans += s+"-"
        }
        return ans
    }

    /**
     * @param {string} str
     * @returns {string[]}
     */
    decode(str) {
       let  ans=[]
       let  s=""
        for(let i of str){
         if(i=="-"){
            ans.push(s)
            s=""
         }
         else{
            s+= i
         }
        }
        return ans 
    }
}
