package conclusion;

public class SerializeDeserializeBT {
    private static final String SPLITTER = ", ";
    private static final String NULL_SIGN = "#";
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        serializeHelper(root, sb);
        return sb.toString();
        
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        Queue<String> stringToNodeList = new LinkedList<>();
        stringToNodeList.addAll(Arrays.asList(data.split(SPLITTER)));
        return deserializeHelper(stringToNodeList);
    
    }
    
    public void serializeHelper(TreeNode node, StringBuilder sb) {
        if (node == null) {
            sb.append(NULL_SIGN).append(SPLITTER);
        } else {
            sb.append("" + node.val).append(SPLITTER);
            serializeHelper(node.left, sb);
            serializeHelper(node.right, sb);
        }
    }
    
    public TreeNode deserializeHelper(Queue<String> nodes) {
        String currentNode = nodes.remove();
        if(currentNode.equals(NULL_SIGN)) {
            return null;
        } else {
            TreeNode node = new TreeNode(Integer.valueOf(currentNode));
            node.left = deserializeHelper(nodes);
            node.right = deserializeHelper(nodes);
            return node;
        }
      
    }
    
}
