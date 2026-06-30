class Solution {
    /**
     * @param {number[]} heights
     * @return {number}
     */
    largestRectangleArea(heights) {
        let n = heights.length
        let nsl = NSL(heights)
        let nsr = NSR(heights)
        let ans = 0
        for(let i = 0;i< n ;i++){
            let w = nsr[i]-nsl[i]-1
            let area = w* heights[i]
            ans = ans>area ? ans : area
        }
        return ans
    }
 
}
function NSL(arr) {
    const n = arr.length;
    const stack = [];
    const ans = new Array(n);

    for (let i = 0; i < n; i++) {
        while (stack.length && arr[stack[stack.length - 1]] >= arr[i]) {
            stack.pop();
        }

        ans[i] = stack.length ? stack[stack.length - 1] : -1;
        stack.push(i);
    }

    return ans;
}
function NSR(arr) {
    const n = arr.length;
    const stack = [];
    const ans = new Array(n);

    for (let i = n - 1; i >= 0; i--) {
        while (stack.length && arr[stack[stack.length - 1]] >= arr[i]) {
            stack.pop();
        }

        ans[i] = stack.length ? stack[stack.length - 1] : n;
        stack.push(i);
    }

    return ans;
}