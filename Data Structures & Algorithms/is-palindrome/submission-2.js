class Solution {
    /**
     * @param {string} s
     * @return {boolean}
     */
    isPalindrome(s) {
        s= s.toLowerCase()
        let i = 0
        let j = s.length -1
        while(i<=j){
            if(!((65<=s.charCodeAt(i) && s.charCodeAt(i)<=90) || (97<=s.charCodeAt(i) && s.charCodeAt(i)<=122) ||(48<=s.charCodeAt(i) && s.charCodeAt(i)<=57) )) i++;
            else if(!((65<=s.charCodeAt(j) && s.charCodeAt(j)<=90) || (97<=s.charCodeAt(j) && s.charCodeAt(j)<=122) ||(48<=s.charCodeAt(j) && s.charCodeAt(j)<=57) )) j--;
            else{
                if(s[i]!=s[j]) return false;
                i++
                j--
            }
        }
        return true 
    }
}
