import java.util.*;

public class Solution {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null) {
            return t2;
        }
        if (t2 == null) {
            return t1;
        }
        
        int sum = t1.val + t2.val;
        TreeNode newNode = new TreeNode(sum);
        
        newNode.left = mergeTrees(t1.left, t2.left);
        newNode.right = mergeTrees(t1.right, t2.right);
        
        return newNode;
    }
}
