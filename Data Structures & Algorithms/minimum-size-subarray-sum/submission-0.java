class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int ans = n + 1;
        int left = 0;
        int s = 0;
        for (int right = 0; right < nums.length; right++) {
            s += nums[right];
            while (s >= target ) {
                ans = Math.min(ans, right - left + 1);
                s -= nums[left++];

            }
            
        }
        return ans == n + 1 ? 0 : ans;
    }
}

