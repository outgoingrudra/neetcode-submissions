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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ls = new ArrayList<>();
        sol(root,ls);
        return ls;
    }
    private void sol(TreeNode n , List<Integer> a){
        if(n!=null){
           
            sol(n.left,a);
             a.add(n.val);
            sol(n.right,a);
        }
    }
    
}