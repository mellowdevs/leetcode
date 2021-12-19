public class BottomUpMaximumDepth {
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
