class Solution {
    public boolean isHappy(int n) {
        int slow = n ;
        int fast = n ;
        do{
            slow = count(slow);
            fast = count(count(fast));
        }while(slow!=fast);
        if(slow==1) return true ;
        return false ;
    }
    private int count(int n){
        int ans = 0;
        while(n !=0){
            int d  = n%10;
            n= n/10;
            ans += d*d;
        }
        return ans ;
    }
}
