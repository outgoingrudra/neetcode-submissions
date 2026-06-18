class Solution {
    /**
     * @param {string} s
     * @param {string} t
     * @return {boolean}
     */
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
}
