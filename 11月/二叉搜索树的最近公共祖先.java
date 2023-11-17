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
//遇到的问题是因为在 BigNumber 方法中，对于找到节点 p 或节点 q 后返回的值没有正确处理。
// 根据您提供的树的例子{7,1,12,0,4,11,14,#,#,3,5}，
// 节点 12 的左子树是节点 11，右子树是节点 14。在找到节点 12 和 11 后，
// 应该返回节点 12 的值作为结果，
// 但是目前的代码在这种情况下可能会返回节点 11 的值
public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     *
     * @param root TreeNode类
     * @param p int整型
     * @param q int整型
     * @return int整型
     */
    
    public int lowestCommonAncestor (TreeNode root, int p, int q) {
        // write code here
        if (root == null) {
            return -1;
        }
        return BigNumber(root,p,q);
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