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
    public int goodNodes(TreeNode root) {
        int max =  Integer.MIN_VALUE ;
        int cnt[] = new int[1];
        Travel(root,max,cnt);
        return cnt[0];
    }
    
private static void Travel(TreeNode root, int max , int[] cnt ){
   if(root==null)  return;
   if(root.val>= max) cnt[0]++;
   
   max = Math.max( root.val , max );
   Travel(root.left , max , cnt );
   Travel(root.right , max , cnt );

}

}
