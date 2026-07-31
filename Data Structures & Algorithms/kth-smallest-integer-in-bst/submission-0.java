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
    public int kthSmallest(TreeNode root, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)-> b - a );
        travel(root,k,pq);
        return pq.poll();

    }
    private static void travel(TreeNode root , int k , PriorityQueue<Integer> pq ){
        if(root==null) return ;
        pq.offer(root.val);
        if(pq.size()>k) pq.poll();
        travel(root.left,k,pq);
        travel(root.right,k,pq);
    }
}
