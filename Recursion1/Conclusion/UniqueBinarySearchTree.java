package Recursion1.Conclusion;

public class UniqueBinarySearchTree {
    public List<TreeNode> generateTrees(int n) {
        return helper(1, n);
    }
    
    public List<TreeNode> helper(int start, int end) {
        List<TreeNode> result = new ArrayList<>();
        if (start > end) {
            result.add(null);
            return result;
        }
        
        for (int i = start; i <= end; i++)  {
             List<TreeNode> leftSubTree = helper(start, i - 1);
            List<TreeNode> rightSubTree = helper(i + 1, end);
            int current = i;
            for (int j = 0; j < leftSubTree.size(); j++)  {
                for (int k = 0; k < rightSubTree.size(); k++)  {
                    TreeNode node = new TreeNode(current);
                    node.left = leftSubTree.get(j);
                    node.right = rightSubTree.get(k);
                    result.add(node);
                }
            }
        }
        return result;
        
    }
    
}
