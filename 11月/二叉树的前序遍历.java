import java.util.*;

/*
 * public class TreeNode {
 *   int val = 0;
 *   TreeNode left = null;
 *   TreeNode right = null;
 *   public TreeNode(int val) {
 *     this.val = val;
 *   }
 * }
 */

public class Solution {
    public int[] preorderTraversal (TreeNode root) {
        //二叉树前序遍历就是深度优先遍历
        List<Integer> list = new ArrayList<>();
        dfs(list, root);
        int[] res = new int[list.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = list.get(i);
        }
        return res;
    }
    //递归,先输出根节点，再依次遍历左子树、右子树
    public void dfs(List<Integer> list, TreeNode root) {
        if (root != null) {
            list.add(root.val);
            dfs(list, root.left);
            dfs(list, root.right);
        }

    }
}