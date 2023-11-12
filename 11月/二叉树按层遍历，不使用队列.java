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
        // write code here
        if (root == null) {
            return new ArrayList();
        }
        ArrayList<ArrayList<Integer>> list = new ArrayList();
        traversal(list, root, 0);
        return list;
    }

    public void traversal(List<ArrayList<Integer>> list, TreeNode node, int level) {
        if (node == null) {
            return;
        }
        if (level >= list.size()) {
            list.add(new ArrayList<>());
        }
        list.get(level).add(node.val);
        traversal(list, node.left, level + 1);
        traversal(list, node.right, level + 1);
    }
}
