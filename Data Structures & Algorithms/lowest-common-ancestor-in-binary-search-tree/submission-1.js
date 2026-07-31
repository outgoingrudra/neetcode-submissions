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
     * @param {TreeNode} p
     * @param {TreeNode} q
     * @return {TreeNode}
     */
    lowestCommonAncestor(root, p, q) {
        return LCA(root,p,q)
    }
}

function LCA(root,p,q){
    if(!root || root == p || root == q) return root;
    let left = LCA(root.left , p ,q)
    let right = LCA(root.right , p ,q)
    if(!left) return right
    else if(!right) return left
    else return root 

}