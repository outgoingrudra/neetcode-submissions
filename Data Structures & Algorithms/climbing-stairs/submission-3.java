
class Solution {
    int a[];
    public int climbStairs(int n) {
        a = new int[n+1];
        Arrays.fill(a,-1);
         return count(1,n) +1 ;
    }
    private int count(int i  , int n){
       
        if(i < n){
             if(a[i]!=-1) return a[i];
             a[i]=  1 + count(i+1,n) + count(i+2 , n);
             return a[i];
        }
        return 0 ;
    }
}
