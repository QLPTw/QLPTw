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
     * @param targetSum int整型
     * @return bool布尔型
     */
    public boolean popo(TreeNode root, int number) {
        if (root == null) {
            return false;
        }
        number -= root.val;
        if (number == 0) {
            return true;
        }
        return popo(root.left, number) || popo(root.right, number);
    }
    public boolean hasPathSumII (TreeNode root, int targetSum) {
        // write code here
        if (root == null) {
            return false;
        }
        return popo(root, targetSum) || hasPathSumII(root.left, targetSum) ||
               hasPathSumII(root.right, targetSum);
    }
}