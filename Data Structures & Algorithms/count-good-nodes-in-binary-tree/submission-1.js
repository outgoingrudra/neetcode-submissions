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
    goodNodes(root) {
     let max = -Infinity
     let cnt= [0]
     Travel(root,max,cnt)
     return cnt[0] 

    }
}

function Travel(root, max , cnt ){
   if(root==null)  return
   if(root.val>= max) cnt[0]++
   
   max = Math.max( root.val , max )
   Travel(root.left , max , cnt )
   Travel(root.right , max , cnt )

}
