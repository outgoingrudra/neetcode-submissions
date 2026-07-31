/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return LCA(root,p,q);
    }
    private static TreeNode LCA(TreeNode root, TreeNode p , TreeNode q){
        if(root==null) return root ;
        if(root == p ) return root ;
        if(root == q) return root ;

        TreeNode left = LCA(root.left , p ,q);
        TreeNode right = LCA(root.right , p ,q);

        if(left==null) return right ;
        if(right==null) return left;
        return root;

    }
}
