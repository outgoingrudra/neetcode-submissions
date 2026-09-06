class Solution {
    public int maxProfit(int[] prices) {
        int ans =  0;
        int n = prices.length ;
        int min = prices[0] ;
        for(int i = 1 ;i < n ;i ++){
           ans += Math.max(0,prices[i]-prices[i-1]);
        }
        return ans ;
    }
}