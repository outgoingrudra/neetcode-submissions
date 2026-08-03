class Solution {
    public void sortColors(int[] nums) {
        int left =0 , mid = 0 , right = nums.length -1 ;
        while(mid<=right){
            if(nums[mid]==1) mid++;
            else if(nums[mid]==0) swap(nums , mid++, left++);
            else swap(nums , mid, right--);
        }
    }
    private static void swap(int a[] , int x , int y){
         int t = a[x];
         a[x] = a[y];
         a[y]=t;
    }
}