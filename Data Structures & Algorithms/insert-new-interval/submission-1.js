class Solution {
    /**
     * @param {number[][]} intervals
     * @param {number[]} newInterval
     * @return {number[][]}
     */
    insert(intervals, newInterval) {
        let ans = [] 
        for(let interval of intervals){
            if(interval[1] <  newInterval[0]) ans.push(interval);
            else if(interval[0] >  newInterval[1]) {
                ans.push(newInterval);
                newInterval =  interval ;
            }
            else {
                newInterval[0] = Math.min(interval[0],newInterval[0]);
                newInterval[1] = Math.max(interval[1],newInterval[1]);
            }
        }
        ans.push(newInterval)
        return ans 
    }
}
