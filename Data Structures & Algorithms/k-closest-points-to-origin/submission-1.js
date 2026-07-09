class Solution {
    /**
     * @param {number[][]} points
     * @param {number} k
     * @return {number[][]}
     */
    kClosest(points, k) {
      const pq = new MaxPriorityQueue(
            point => point[0] * point[0] + point[1] * point[1]
        );

         
         for(let xy of points){
            pq.enqueue(xy)
            if(pq.size()>k) pq.dequeue()
         }
          const ans = [];

        while (pq.size() > 0) {
            ans.push(pq.dequeue());
        }

        return ans;

    }
}