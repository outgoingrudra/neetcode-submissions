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
    public int maxPathSum(TreeNode root) {
        int max[] = new int[1];
        max[0] = -100000;
        travel(root,max);
        return max[0];
    }
    private static int travel(TreeNode root , int[]  max){
        if(root==null) return 0 ;
        int left = travel(root.left,max);
        left = left < 0 ? 0 : left ;
        int right = travel(root.right,max);
        right = right <0 ? 0 : right ;
        max[0] = Math.max(max[0], left + right + root.val);

        return Math.max(left,right)+root.val;
    }
}
