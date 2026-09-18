class Solution {
    private void rot(int a[] , int i , int j){
        while(i <=j){
            int t = a[i];
            a[i] =a[j];
            a[j]=t;
            i++;
            j--;
        }
    }
    public void rotate(int[] nums, int k) {
        int n = nums.length ;
        k = k%n ;
                rot(nums,0,n-1);
        rot(nums,0,k-1);
        rot(nums,k,n-1);

    }
}