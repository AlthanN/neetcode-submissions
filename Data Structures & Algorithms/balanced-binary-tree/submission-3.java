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
        if(root == null) return true;
        int l = height(root.left);
        int r = height(root.right);
        System.out.println("main left:" + l);
        System.out.println("main right:" + r);

        if(l == -1 || r == -1) {
            return false;
        }
        if(Math.abs(l-r) > 1) {
            return false;
        }
        return true;

    }
    public int height(TreeNode root) {
        if(root == null) return 0;
        int l = height(root.left);
        int r = height(root.right);
        System.out.println("root: " + root.val + "\n");
        System.out.println("left: " + l);
        System.out.println("right: " + r + "\n");

        if(Math.abs(l - r) > 1) {
            return -1;
        } 
        if(l == -1 || r == -1) {
            return -1;
        }
        return Math.max(l, r) + 1;
    }
}
