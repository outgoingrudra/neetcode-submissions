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
     * @return {boolean}
     */
    isValidBST(root) {
        return check(root, -Infinity, Infinity)
    }
}

function check(root, min , max  ){
 if(!root) return true 
 if(root.val <= min || root.val >=max) return false 

 return (
    check(root.left , min , root.val) && check(root.right , root.val , max )
 )
}
