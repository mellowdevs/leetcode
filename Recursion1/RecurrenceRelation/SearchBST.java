package Recursion1.RecurrenceRelation;

public class SearchBST {
    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null || root.val == val) return root;
        if (root.val > val) {
         return searchBST(root.left, val);
        } else if (root.val < val) {
          return searchBST(root.right, val);
        } 
        return null;
    }
    
}
