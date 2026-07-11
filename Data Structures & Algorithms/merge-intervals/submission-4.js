class Solution {
    /**
     * @param {number[][]} intervals
     * @return {number[][]}
     */
    merge(intervals) {
        let ans = []
        intervals.sort((a,b)=> a[0] -  b[0])
        let n = intervals.length 
        let i = 0
        while(i<n){
            let start = intervals[i][0]
            let end = intervals[i][1]
            let j = i+1
            while(j<n && intervals[j][0]<= end){
                end = Math.max(intervals[j][1],end)
                j ++
            }
            ans.push([start,end])
            i= j
        }
        return ans 
    }
}
