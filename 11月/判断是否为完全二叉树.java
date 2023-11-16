import java.util.ArrayList;

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
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     *
     * @param root TreeNode类
     * @return bool布尔型
     */
    public boolean isCompleteTree (TreeNode root) {
        if (root == null) {
            return true;
        }
        ArrayList<TreeNode> queue = new ArrayList<>();
        queue.add(root);
        boolean reachEnd = false;
        while (!queue.isEmpty()) {
            TreeNode node = queue.remove(0);
            if (node == null) {
                reachEnd = true; // 标记已经出现过空节点
            } else {
                if (reachEnd) {
                    return false; // 若之前已出现空节点，当前节点非空则不是完全二叉树
                }
                queue.add(node.left);
                queue.add(node.right);
            }
        }
        return true;
    }
}