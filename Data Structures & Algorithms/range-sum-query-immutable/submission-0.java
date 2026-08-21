class NumArray {
    int arr[] ;
    public NumArray(int[] nums) {
        arr = nums;
    }
    
    public int sumRange(int left, int right) {
        int ans = 0;
        for(;right>=left ;left++) ans+= arr[left];
        return ans ;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */