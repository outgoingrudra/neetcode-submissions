


class KthLargest {
    /**
     * @param {number} k
     * @param {number[]} nums
     */
    
    constructor(k, nums) {
        this.k = k ;
        this.p = new MinPriorityQueue()
        for(let x of nums){
            this.p.enqueue(x)
            if(this.p.size()>this.k) this.p.dequeue()
        }

    }

    /**
     * @param {number} val
     * @return {number}
     */
    add(val) {
         this.p.enqueue(val)
            if(this.p.size()>this.k) this.p.dequeue()
            return this.p.front()
    }
}







