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
    int preIndex = 0;
    int[] preOrder;
    HashMap<Integer, Integer> inorderMap = new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        preOrder = preorder;
        for(int i = 0; i < inorder.length;  i++) {
            inorderMap.put(inorder[i], i);
        }
        return builder(0, preOrder.length - 1);
    }
    
    public TreeNode builder(int inorderLeft, int inorderRight) {
        if (inorderLeft > inorderRight) return null;
        int value = preOrder[preIndex++];
        int index = inorderMap.get(value);
        TreeNode node = new TreeNode(value);
        node.left = builder(inorderLeft, index - 1);
        node.right = builder(index + 1, inorderRight);
        return node;

    }
}