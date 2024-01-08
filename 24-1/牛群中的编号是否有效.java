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
    public boolean isValidBST (TreeNode root) {
        // write code here
        if(root==null){
            return true;
        }
        if(root.left==null&&root.right==null){
            return true;
        }
        if(root.right!=null&&root.right.val<root.val){
            return false;
        }
        if(root.left!=null&&root.left.val>root.val){
            return false;
        }
        return isValidBST(root.left)&&isValidBST(root.right);
    }
}