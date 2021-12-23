package conclusion;
public class BTFromInorderAndPostOrder {
    public static void main(String[] args) {
        int[] inorder = {1,2};
        int[] postorder = {2,1};
        TreeNode tree = buildTree(inorder, postorder);
        System.out.println("TTreeee: " + tree.val);
        System.out.println("l: " + tree.left);
        System.out.println("r: " + tree.right);
    }

    public static TreeNode buildTree(int[] inorder, int[] postorder) {
        if (inorder.length == 0) return null;
        if (postorder.length == 0) return null;
        if (inorder.length == 1) return new TreeNode(inorder[0]);
        int rootVal = postorder[postorder.length - 1];
        TreeNode root = new TreeNode(rootVal);
        int indexOfRoot = indexOf(inorder, rootVal);
        int[] leftInOrderTree = new int[indexOfRoot];
        int[] rightInOrderTree = new int[inorder.length - indexOfRoot - 1];
        int[] leftPostTree = new int[leftInOrderTree.length];
        int[] rightPostTree = new int[rightInOrderTree.length];
        for (int i = 0; i < inorder.length; i++) {
            if (i < indexOfRoot) {
                leftInOrderTree[i] = inorder[i];
            } else if (i > indexOfRoot) {
                rightInOrderTree[i - indexOfRoot - 1] = inorder[i];
            }
        }
        for (int i = 0; i < leftPostTree.length; i++) {
            leftPostTree[i] = postorder[i];
        }
         for (int i = 0; i < rightPostTree.length; i++) {
            rightPostTree[i] = postorder[leftPostTree.length + i];
        }
        root.left = buildTree(leftInOrderTree, leftPostTree);
        root.right = buildTree(rightInOrderTree, rightPostTree); 

        return root;
        
    }
    public static int indexOf(int[] arr, int elem) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == elem) return i;
        }
        return -1;
    }
}


class TreeNode {
    int val;
 TreeNode left;
 TreeNode right;
TreeNode() {}
TreeNode(int val) { this.val = val; }
TreeNode(int val, TreeNode left, TreeNode right) {
       this.val = val;
       this.left = left;
        this.right = right;
   }
 }

 
