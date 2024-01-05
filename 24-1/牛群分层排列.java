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
     * @return string字符串一维数组
     */
    public String[] levelOrder (TreeNode root) {
        // write code here
        List<String> result = new ArrayList<>();
        if (root == null) {
            return listToArray(result);
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            StringBuilder levelNodes = new StringBuilder();

            for (int i = 0; i < levelSize; i++) {
                TreeNode node = queue.poll();
                levelNodes.append(node.val);

                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }

            result.add(levelNodes.toString());
        }

        return listToArray(result);
    }

    //集合转数组
    private String[] listToArray(List<String> list) {
        String[] array = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }
        return array;
    }
}
