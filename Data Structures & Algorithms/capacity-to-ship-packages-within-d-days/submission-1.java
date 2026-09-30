class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int left  = 0;
        int right = 100000000;
        int ans = right ;
        while(left <= right){
           int mid = (left+right)/2;
           if(isPossible(weights,days,mid)){
            ans = mid ;
            right = mid -1;
           }
           else left = mid +1;
        }
        return ans;
    }
    private static boolean isPossible(int a[] , int d , int cap){
        int c = 1;
        int s = 0;
        for(int x : a){
               if(x>cap) return false ;
               if(s+x > cap){
                    c++;
                    s=x;
               }
               else s+=x;
               if(c>d) return false;
        }

        return true ;
    }
}