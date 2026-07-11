class Solution {
    /**
     * @param {string} S
     * @return {number[]}
     */
    partitionLabels(s) {
        let mpp = new Map()
        let n  = s.length 
        for(let i = n-1 ;i>=0 ;i--){
               if(!mpp.has(s[i])){
                mpp.set(s[i],i)
               }
        }

        let start = 0
        let end = 0
        let ans= []
        for(let i = 0;i < n ;i++ ){
            end = Math.max(end,mpp.get(s[i]))
            if(i==end){
                  ans.push(end-start+1)
                  start = i+1
            }
        }
        return ans 

    }
}
