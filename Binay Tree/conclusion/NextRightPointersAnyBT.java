package conclusion;
public class NextRightPointersAnyBT {
    public Node connect(Node root) {
        connectNodes(root);
        return root;
    }
    private void connectNodes(Node node) {
        if (node == null) return;
        if (node.left != null && node.right !=null) {
            node.left.next = node.right;
        } else if (node.left != null && node.right ==null) {
            node.left.next = findNextFromParent(node.next);
        } 
        if (node.right !=null) {
            node.right.next = findNextFromParent(node.next);
        } 
        connectNodes(node.right);
        connectNodes(node.left);
    }
    private Node findNextFromParent(Node node) {
        if (node == null) return null;
        if (node.left != null) return node.left;
        if (node.right != null) return node.right;
        return findNextFromParent(node.next);
    }
}
