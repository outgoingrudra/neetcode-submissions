class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 0;
        int right  = 1000000000;
        int ans = right;
        while(left <= right){
            int mid = (left + right)/2;
            if(isPossible(piles , h , mid)){
                ans = mid ;
                right = mid -1;
            }
            else left = mid +1;
        }
        return ans;
    }
    private static boolean isPossible(int a[] , int h , int speed){
        int c = 0;
        for(int x : a){
            c     += Math.ceil(x/(double)speed);
            if(c>h) return false;
        }
        return true ;
    }
}
