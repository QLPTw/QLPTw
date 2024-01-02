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
     * @param p TreeNode类 
     * @param q TreeNode类 
     * @return bool布尔型
     */
    public boolean popo(TreeNode one,TreeNode two){
        if(one==null&&two==null){
            return true;
        }else if(one==null){
            return false;
        }else if(two==null){
            return false;
        }else if(one.val!=two.val){
            return false;
        }
        return popo(one.left,two.left)&&popo(one.right,two.right);
    }
    public boolean isSameTree (TreeNode p, TreeNode q) {
        // write code here
        return popo(p,q);
    }
}