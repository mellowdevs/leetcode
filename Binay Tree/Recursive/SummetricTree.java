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
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        if (maxDepth(root.right) != maxDepth(root.left)) return false;
        return helper(root.left, root.right);
        
    }
    
    public boolean helper(TreeNode left, TreeNode right) {
        if (left == null && right == null) return true;
        if ((left == null && right != null) || (left != null && right == null)) return false;
        return (left.val == right.val && helper(left.left, right.right)) && helper(left.right, right.left);
        
        
    }
    
    public int maxDepth(TreeNode root) {
        if (root == null)  return 0;
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return max(left, right) + 1;
    }
    
    public int max(int a, int b) {
        if (a < b) return b;
        else return a;
    }
}