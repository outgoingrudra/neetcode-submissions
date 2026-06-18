class Solution {
      isAnagram(s, t) {
        if(s.length != t.length) return false 
        let hash = new Array(26).fill(0)
        for(let x = 0; x< s.length ; x++) {
            hash[s.charCodeAt(x)-97]+=1
            hash[t.charCodeAt(x)-97]-=1
        }
    
        for(let x of hash){
             if(x!=0) return false
        }
        return true 
    }
    /**
     * @param {string[]} strs
     * @return {string[][]}
     */
    groupAnagrams(strs) {
        let ans= []
        for(let s of strs){
            let done = false
            for(let i =0;i< ans.length ;i++){
                if(this.isAnagram(s,ans[i][0])){
                    ans[i].push(s)
                    done = true
                    break
                }
            }
            if(!done){
                ans.push([s])
            }
        }
        return ans
    }
}
