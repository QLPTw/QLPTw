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
    public int popo(TreeNode root, int n) {
        if (root == null) {
            return n;
        }
        int res = 0;
        res = Math.max(Math.max(popo(root.right, root.val), popo(root.left, root.val)),
                       n);
        return res;
    }
    public int findMaxHeight (TreeNode root) {
        // write code here
        if (root == null) {
            return 0;
        }
        int res = root.val;
        res = popo(root, res);
        return res;
    }
}