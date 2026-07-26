class Solution {
    public int reverse(int x) {
        long ans = 0L;
        boolean neg = x< 0;
        if(x<0) x= -x;
        while(x>0){
            ans  = ans*10 + x%10 ;
            x = x/10;
            if(ans>Integer.MAX_VALUE ) return 0;
        }
        return (int)(neg  ? -ans : ans );
    }
}
