class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 0;
        long right =  0 ;
        for(int x : piles) right = Math.max(right, x);
        long ans = right ;
        while(left<=right){
            long mid = left + (right - left)/2 ;
            if(isPossible(piles , (int)mid, h)){
                  ans = mid  ;
                  right = mid -1 ;
            }
            else left = (int)mid +1 ;
        }
        return (int)ans ;
    }
    private static boolean isPossible(int nums[] , int speed , int time  ){
        double hrs = 0;
        for(double x : nums){
            hrs += Math.ceil(x/speed);
            if(hrs>time) return false;
        }
        return hrs <= time ;
        
    }
  
}