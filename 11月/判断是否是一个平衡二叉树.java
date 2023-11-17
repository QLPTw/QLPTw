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
     * @return bool布尔型
     */
     boolean pool=true;
    public boolean IsBalanced_Solution (TreeNode pRoot) {
        // write code here
        if(pRoot==null){
            return true;
        }
        ReDeep(pRoot);
        return pool;
    }

    public int ReDeep(TreeNode root){
        if(root==null){
            return 1;
        }
        int left=0,right=0;
        left=ReDeep(root.left);
        right=ReDeep(root.right);
        if(Math.abs(left-right)>1){
            pool=false;
        }
        return left>right?(left+1):(right+1);
    }

}