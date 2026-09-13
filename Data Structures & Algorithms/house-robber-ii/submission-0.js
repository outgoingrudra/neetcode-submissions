class Solution {
    rob(nums) {
        if (nums.length === 1) return nums[0]

        return Math.max(
            solve(nums, 0, nums.length - 2),
            solve(nums, 1, nums.length - 1)
        )
    }
}

function solve(nums, start, end) {
    let mem = new Array(nums.length).fill(-1)

    function count(i) {
        if (i > end) return 0

        if (mem[i] !== -1) return mem[i]

        return mem[i] = Math.max(
            nums[i] + count(i + 2),
            count(i + 1)
        )
    }

    return count(start)
}