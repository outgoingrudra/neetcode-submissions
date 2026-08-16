class Solution {
    public int mySqrt(int x) {
        int left = 0;
        int right = 100000000;
        while(left <= right){
            int mid = (left+right)/2;
            long mul = (long)mid * (long)mid;
            if(mul==x) return mid;
            if(mul<x)  left = mid +1;
            else right = mid -1;
        }
        return left-1 ;
    }
}