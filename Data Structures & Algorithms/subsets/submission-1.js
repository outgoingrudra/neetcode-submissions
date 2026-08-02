class Solution {
    ans = [];

    subsets(nums) {
        this.ans = [];
        this.solve(nums, 0, []);
        return this.ans;
    }

    solve(nums, idx, arr) {
        if (idx === nums.length) {
            this.ans.push([...arr]);
            return;
        }

        arr.push(nums[idx]);
        this.solve(nums, idx + 1, arr);

        arr.pop();

        this.solve(nums, idx + 1, arr);
    }
}