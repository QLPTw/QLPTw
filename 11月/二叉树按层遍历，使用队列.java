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
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     *
     * @param root TreeNode类
     * @return int整型ArrayList<ArrayList<>>
     */
    public ArrayList<ArrayList<Integer>> levelOrder (TreeNode root) {
        // 创建结果列表
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root); // 将根节点加入队列

        while (!queue.isEmpty()) {
            int size = queue.size();
            ArrayList<Integer> levelNodes = new ArrayList<>(); // 用于存储当前层的节点值
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                levelNodes.add(node.val); // 将当前节点值加入当前层列表
                if (node.left != null) {
                    queue.offer(node.left);  // 将左子节点加入队列
                }
                if (node.right != null) {
                    queue.offer(node.right); // 将右子节点加入队列
                }
            }
            result.add(levelNodes); // 将当前层的节点值列表加入结果列表
        }

        return result;
    }
}
