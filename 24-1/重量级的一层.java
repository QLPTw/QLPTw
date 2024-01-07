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
     * @return int整型
     */
    public int maxLevelSum (TreeNode root) {
        LinkedList<TreeNode> linkedList = new LinkedList<>();
        linkedList.add(root);
        int max = Integer.MIN_VALUE;
        // index是层数
        int index = 1;
        // result是最大和的层数
        int result = 1;
        while (!linkedList.isEmpty()) {
            int sum = 0;
            // 每一层求和
            for (TreeNode treeNode : linkedList) {
                sum += treeNode.val;
            }
            // 寻找最大值并记录索引
            if (sum > max) {
                max = sum;
                result = index;
            }
            // 进入下一层
            index++;
            int size = linkedList.size();
            // 向队列添加节点,进入下层
            while (size-- > 0) {
                TreeNode node = linkedList.poll();
                if (node.left != null) {
                    linkedList.add(node.left);
                }
                if (node.right != null) {
                    linkedList.add(node.right);
                }
            }
        }
        return result;
    }
}