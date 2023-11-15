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
     * @param pRoot TreeNode类
     * @return TreeNode类
     */
    public TreeNode Mirror (TreeNode pRoot) {
        // write code here
        if (pRoot == null) {
            return pRoot;
        }
        Replace(pRoot, pRoot.left, pRoot.right);
        return pRoot;
    }

    public void Replace(TreeNode pre, TreeNode root01, TreeNode root02) {
        if (root01 == null && root02 == null) {
            return;
        }
        pre.left = root02;
        pre.right = root01;
        if (root01 != null) {
            Replace(root01, root01.left, root01.right);
        }
        if (root02 != null) {
            Replace(root02, root02.left, root02.right);
        }

    }
}