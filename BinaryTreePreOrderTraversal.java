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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> resultList = new ArrayList<>();
        if(root != null){
            resultList.add(root.val);
            if(root.left != null) {
                resultList.addAll(preorderTraversal(root.left));
            } 
            if(root.right != null) {
                resultList.addAll(preorderTraversal(root.right));
            }
        }
        return resultList;

    }
}