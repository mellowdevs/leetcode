package conclusion;
public class LowestCommonAncestorOfABT {
    TreeNode answer;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        answer = null;
        traverseTree(root, p, q);
        return answer;
        
    }
    
    public boolean traverseTree(TreeNode node, TreeNode p, TreeNode q) {
        if (node == null) return false;
        int checkEquality =  (node.val == p.val || node.val == q.val ) ? 1 : 0;
        int checkLeftChild =  (traverseTree(node.left, p, q)) ? 1 : 0;
        int checkRightChild =  (traverseTree(node.right, p, q)) ? 1 : 0;
        
        if (checkEquality + checkRightChild + checkLeftChild > 1) {
            this.answer = node;
            return true;
        }
        if (checkEquality + checkRightChild + checkLeftChild > 0) {
            return true;
        }
        return false;
        
    }
}
