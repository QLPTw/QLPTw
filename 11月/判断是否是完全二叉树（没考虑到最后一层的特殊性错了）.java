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
     * @return bool布尔型
     */
    public boolean isCompleteTree (TreeNode root) {
        // write code here
        if (root == null) {
            return true;
        }
        ArrayList<Integer> list = new ArrayList();
        ErTree(list, 0, root);
        int k = 1;
        for (int i = 0; i < list.size()-1; i++) {
            if (k != list.get(i)) {
                return false;
            }
            k *= 2;
        }
        return true;
    }

    public void ErTree(ArrayList<Integer> list, int level, TreeNode root) {
        if (root == null) {
            return;
        }
        if (level >= list.size()) {
            list.add(1);
        } else {
            list.set(level, list.get(level) + 1);
        }
        ErTree(list, level + 1, root.left);
        ErTree(list, level + 1, root.right);
    }
}