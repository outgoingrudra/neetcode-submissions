class Solution {
    /**
     * @param {number[]} stones
     * @return {number}
     */
    lastStoneWeight(stones) {
        let pq = new MaxPriorityQueue()
        for(let  x of stones) pq.enqueue(x)

        while(pq.size()>1){
             let x = pq.dequeue()
             let y = pq.dequeue()
             if(x==y) continue
             pq.enqueue(Math.abs(x-y))
        }

        return pq.size() ? pq.dequeue() : 0 
    }
}
