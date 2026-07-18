class Solution {
    /**
     * @param {number[]} digits
     * @return {number[]}
     */
    plusOne(digits) {
        let carry =1 ;
        for(let i = digits.length -1 ;i>=0 ;i--){
            digits[i]+=carry ;
            if(digits[i]==10){
                  digits[i]=0; 
            }
            else{
                return digits ;
            }
        }
     let ans= new Array(digits.length+1);
     ans.fill(0)
       ans[0]= 1 ;
       return ans ;
    }
}
