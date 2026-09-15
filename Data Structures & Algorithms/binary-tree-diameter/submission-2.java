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
    public int diameterOfBinaryTree(TreeNode root) {
        int max[] = new int[]{0};
        solve(root,max);
        return max[0] -1 ;
    }
    private int solve(TreeNode  node , int max[]){
        if(node == null) return 0 ;
        int left = solve(node.left,max);
        int right = solve(node.right,max);
        max[0] = Math.max(max[0],left+right+1);
        return 1 + Math.max(left,right);
    }
}
