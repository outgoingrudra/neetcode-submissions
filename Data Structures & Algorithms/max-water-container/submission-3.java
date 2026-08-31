class Solution {
    public int maxArea(int[] heights) {
        int left = 0 , right = heights.length -1 ;
        int ans  = 0 ;
        while(left<right){
            int area  = Math.min(heights[left],heights[right])* (right -left);
            ans = Math.max(ans,area);
            if(heights[left]<heights[right])left++;
            else if(heights[right]<heights[left])right--;
            else {
                left++;
                right--;
            }

        }
        return ans  ;
    }
}
