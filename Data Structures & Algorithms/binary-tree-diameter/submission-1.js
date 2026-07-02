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
    diameterOfBinaryTree(root) {
        let a =[0]
        solve(root,a)
        return a[0]
    }
}
function solve(root, a){
    if(!root) return 0;
   let  left = solve(root.left,a)
   let   right = solve(root.right,a)
    a[0] = left+right>a[0] ? left+right : a[0]
    return left> right ? left +1 : right +1 ;
}