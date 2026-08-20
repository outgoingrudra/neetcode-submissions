# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def postorderTraversal(self, root: Optional[TreeNode]) -> List[int]:
        ans= []
        def t(n):
            if n :
                t(n.left)
                t(n.right)
                ans.append(n.val)
        t(root)
        return ans
        

        