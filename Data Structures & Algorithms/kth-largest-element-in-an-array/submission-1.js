class Solution {
    /**
     * @param {number[]} nums
     * @param {number} k
     * @return {number}
     */
    findKthLargest(nums, k) {
        const pq = new MinPriorityQueue()
        for(let x of nums){
            pq.enqueue(x)
            if(pq.size()>k) pq.dequeue()
        }
        return pq.front()
    }
}
