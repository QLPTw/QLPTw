import java.util.*;

public class Solution {
    String Serialize(TreeNode root) {
        if (root == null) {
            return "#,";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(root.val).append(",");
        sb.append(Serialize(root.left));
        sb.append(Serialize(root.right));
        return sb.toString();
    }

    TreeNode Deserialize(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        String[] nodes = str.split(",");
        return deserializeHelper(nodes);
    }

    private int index = 0;

    private TreeNode deserializeHelper(String[] nodes) {
        if (index >= nodes.length) {
            return null;
        }
        String nodeVal = nodes[index];
        index++;
        if ("#".equals(nodeVal)) {
            return null;
        }
        TreeNode node = new TreeNode(Integer.parseInt(nodeVal));
        node.left = deserializeHelper(nodes);
        node.right = deserializeHelper(nodes);
        return node;
    }
}
