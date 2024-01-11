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
//农场里有许多牛，每头牛都有一个奶量值。农场主想知道，是否存在一组牛，它们的奶量和等于给定的目标值。每头牛都有一个唯一的编号，编号从1开始，表示它们的产奶量。为了方便管理，农场主将牛的编号按照二叉树的形式排列。
//
//给定一棵表示牛编号的二叉树的根节点 root 和一个表示目标奶量和的整数 targetSum。判断该树中是否存在 根节点到叶子节点 的路径，这条路径上所有牛的奶量和等于目标奶量和 targetSum。如果存在，返回 true ；否则，返回 false。

public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     *
     * @param root TreeNode类
     * @param targetSum int整型
     * @return bool布尔型
     */
    public boolean popo(TreeNode root, int a, int b) {
        if (root == null) {
            return false;
        }
        if (b == a) {
            return true;
        }
        if (popo(root.left, a, b + root.val) || popo(root.right, a, b + root.val)) {
            return true;
        }
        return false;
    }
    public boolean hasPathSum (TreeNode root, int targetSum) {
        // write code here
        if (root == null) {
            return false;
        }
        return popo(root, targetSum, root.val);
    }
}