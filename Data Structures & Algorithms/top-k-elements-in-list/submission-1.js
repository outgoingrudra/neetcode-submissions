class Solution {
    /**
     * @param {number[]} nums
     * @param {number} k
     * @return {number[]}
     */
    topKFrequent(nums, k) {
        let n = nums.length 
      let bucket = Array.from({ length: n + 1 }, () => [])
        let map = new Map()
        for(let n of nums) {
            let cnt = 1
            if(map.has(n)){
               cnt += map.get(n)
            }
            map.set(n,cnt)
        }

        for(let x of map.keys()){
            bucket[map.get(x)].push(x)
        }
        let ans = []
        for(let i  = n; i>=0 ;i--){
            while(bucket[i].length !=0 ){
                ans.push(bucket[i].pop())
                if(ans.length ==k) break 
            }
             if(ans.length ==k) break 
        }
        return ans 

  
    }
}
