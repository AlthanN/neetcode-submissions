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
    public boolean isBalanced(TreeNode root) {
        if(root == null) {
            return true;
        }
        int leftH = height(root.left);
        int rightH = height(root.right);
        if(Math.abs(rightH - leftH) > 1) {
            return false;
        }
        if(leftH == -1 || rightH == -1) {
            return false;
        }
        return true;


    }
    // we need to calculate the heights at each interval, and see if there's a 
    // difference greater than 1
    public int height(TreeNode root) {
        if(root == null) return 0;
        int leftR = height(root.left);
        int rightR = height(root.right);
        if(Math.abs(leftR - rightR) > 1) {
            return -1;
        }
        if(leftR == -1 || rightR == -1) {
            return -1;
        }

        return Math.max(leftR, rightR) + 1;
    }
    
}
