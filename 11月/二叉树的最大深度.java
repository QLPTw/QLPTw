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
    public int maxDepth (TreeNode root) {
        // write code here
        if (root == null) {
            return 0;
        }
        HashSet<Integer> set = new HashSet();
        TreeDeep(set,root,0);
        return set.size();
    }

    public void TreeDeep(HashSet<Integer> set, TreeNode root, int level) {
        if (root != null) {
            ++level;
            if (!set.contains(level)) {
                set.add(level);
            }
            TreeDeep(set, root.left, level);
            TreeDeep(set, root.right, level);
        }
    }
}