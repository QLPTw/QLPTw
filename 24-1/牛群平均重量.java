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
     * @return double浮点型一维数组
     */
    public double[] averageOfLevels (TreeNode root) {
        if (root == null) {
            return new double [0];
        }
        LinkedList<TreeNode> linkedList = new LinkedList<>();
        linkedList.add(root);
        ArrayList<Double> list = new ArrayList<>();
        while (!linkedList.isEmpty()) {
            double average = 0.0;
            for (TreeNode treeNode : linkedList) {
                average += treeNode.val;
            }
            list.add(average / linkedList.size());
            int size = linkedList.size();
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
        double [] result = new double[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}
