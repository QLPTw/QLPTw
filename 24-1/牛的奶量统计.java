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
    public boolean hasPathSum (TreeNode root, int targetSum) {
        // write code here
        if(root==null){
            return false;
        }
        targetSum-=root.val;
        if(targetSum==0){
            return true;
        }
        return hasPathSum(root.left,targetSum)||hasPathSum(root.right,targetSum);

    }
}