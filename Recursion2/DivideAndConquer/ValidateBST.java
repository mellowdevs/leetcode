package Recursion2.DivideAndConquer;

public class ValidateBST {
    
    public boolean isValidBST(TreeNode root) {
        return isBST(root, null, null);
      }    
      private boolean isBST(TreeNode root, TreeNode left, TreeNode right) {
          if (root == null) return true;
          if (left != null && left.val >= root.val) return false;
          if (right != null && right.val <= root.val) return false;
          return isBST(root.left, left, root) && isBST(root.right, root, right);
      }
      
}
