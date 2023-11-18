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
     * @param o1 int整型
     * @param o2 int整型
     * @return int整型
     */
    public int lowestCommonAncestor (TreeNode root, int o1, int o2) {
        // write code here
        if (root == null) {
            return -1;
        }
        return BigNumber(root,o1,o2);
    }

    public int BigNumber(TreeNode root, int p, int q) {
        if (root == null) {
            return -1;
        }
        if (root.val == p || root.val == q) {
            return root.val;
        }
        int left = BigNumber(root.left, p, q);
        int right = BigNumber(root.right, p, q);
        if (left != -1 && right != -1) {
            return root.val;
        }
        if (left != -1) {
            return left;
        }
        if (right != -1) {
            return right;
        }
        return -1;
    }
}