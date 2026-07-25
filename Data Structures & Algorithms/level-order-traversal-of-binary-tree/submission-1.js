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
     * @return {number[][]}
     */
    levelOrder(root) {
        let ans= []
        if(!root) return ans
        const q  = new Queue()
        q.enqueue(root)
        while(!q.isEmpty()){
            let size = q.size()
            let list = []
            for(let i = 0 ;i < size ;i++){
                 let node = q.dequeue()
                 list.push(node.val)
                 if(node.left) q.enqueue(node.left)
                 if(node.right) q.enqueue(node.right)
            }
            ans.push(list)

        }
        return ans
    }
}
