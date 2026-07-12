class Solution {
    /**
     * @param {number[]} height
     * @return {number}
     */
    trap(arr) {
        let n = arr.length 
        let mxl = []
        let mxr = new Array(n)
    
        mxl.push(arr[0])
        for(let i = 1;i < n ;i++) mxl.push(Math.max(mxl[i-1],arr[i]))
        mxr[n-1] = arr[n-1]
        for(let i = n-2;i >=0 ;i--) mxr[i] = (Math.max(mxr[i+1],arr[i]))

        let ans = 0
        for(let i = 0 ;i < n ;i++){
            ans += Math.min(mxl[i],mxr[i]) - arr[i]
        }
        return ans 


    }
}
