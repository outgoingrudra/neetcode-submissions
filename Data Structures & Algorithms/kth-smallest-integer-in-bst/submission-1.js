/**
 * Definition for a binary tree node.
 * class TreeNode {
 *     constructor(val = 0, left = null, right = null) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    /**
     * @param {TreeNode} root
     * @param {number} k
     * @return {number}
     */
    kthSmallest(root, k) {
        let pq = new  MaxPriorityQueue()
        travel(root,k,pq);
        return pq.dequeue()
    }

}
function travel(root,k,pq){
    if(!root) return 
    pq.enqueue(root.val)
    if(pq.size()>k) pq.dequeue()
     travel(root.left,k,pq)
     travel(root.right,k,pq)

}
