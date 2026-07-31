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
     * @return {number}
     */
    maxPathSum(root) {
        let max = [-1000000]
        travel(root,max)
        return max[0]
    }
}

function travel( root ,  max){
        if(root==null) return 0 ;
        let left = travel(root.left,max);
        left = left < 0 ? 0 : left ;
        let  right = travel(root.right,max);
        right = right <0 ? 0 : right ;
        max[0] = Math.max(max[0], left + right + root.val);

        return Math.max(left,right)+root.val;
    }
