class Solution {
    /**
     * @param {number} x
     * @return {number}
     */
    reverse(x) {
        let ans = 0;
        let neg = x< 0;
        let max = Math.pow(2,31)-1
        if(x<0) x= -x;
        while(x>0){
            ans  = ans*10 + x%10 ;
            x =Math.floor( x/10);
            if(ans > max ) return 0;
        }
        return(neg  ? -ans : ans );
    }
}
