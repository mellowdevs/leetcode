import conclusion.TreeNode;

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
        List<Integer> resultList = new ArrayList<>();
        traversalHelper(root, resultList);
        return resultList;
    }
    
    
    public void traversalHelper(TreeNode node, List<Integer> result) {
        if (node == null) return;
        traversalHelper(node.left, result);
        result.add(node.val);
        traversalHelper(node.right, result);
    }
}

