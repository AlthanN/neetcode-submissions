# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def isBalanced(self, root: Optional[TreeNode]) -> bool:
        if root is None:
            return True
        leftTree = self.heightCalc(root.left)
        rightTree = self.heightCalc(root.right)
        if abs(rightTree - leftTree) > 1:
            return False
        
        return True and (self.isBalanced(root.left) and self.isBalanced(root.right))

    def heightCalc(self, root):
        if root is None:
            return 0
        
        return max(1 + self.heightCalc(root.left), 1 + self.heightCalc(root.right))