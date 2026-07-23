class Solution {
    /**
     * @param {number[]} nums
     * @param {number} k
     * @return {number[]}
     */
    maxSlidingWindow(nums, k) {
        const ans = [];
        const dq = []; // stores indices
        let left = 0;

        for (let right = 0; right < nums.length; right++) {

            while (dq.length !== 0 && nums[dq[dq.length - 1]] <= nums[right]) {
                dq.pop();
            }

            dq.push(right);

            if (right - left + 1 === k) {
                ans.push(nums[dq[0]]);

                if (dq[0] === left) {
                    dq.shift();
                }

                left++;
            }
        }

        return ans;
    }
}