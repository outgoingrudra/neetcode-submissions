class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m  = nums1.length ;
        int n  = nums2.length ;
        if(m>n) return  findMedianSortedArrays( nums2 , nums1 );

        int left = 0;
        int right =  m ;
        int actualHalf = (m+n+1)/2;
        while(left <= right){
            int cut1 = (left+right)/2;
            int cut2 = actualHalf - cut1 ;
            int leftA = cut1==0 ? Integer.MIN_VALUE : nums1[cut1-1];
            int leftB = cut2==0 ? Integer.MIN_VALUE : nums2[cut2-1];
            int rightA = cut1==m ? Integer.MAX_VALUE : nums1[cut1];
            int rightB = cut2==n ? Integer.MAX_VALUE : nums2[cut2];

            if(leftA<= rightB && leftB <= rightA){
                if((m+n)%2==1){
                    return Math.max(leftA , leftB);
                }
                return (Math.max(leftA,leftB)+ Math.min(rightA,rightB))/2.0;
            }

            if(leftA>rightB){
                right = cut1-1;
            }
            else left = cut1+1;

        }
        return 0.0;
    }
}