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
     * @return int整型一维数组
     */
    public int[] inorderTraversal (TreeNode root) {
        // write code here
      if(root==null){
        return new int[0];
      }
      ArrayList<Integer> list=new ArrayList<>();
      LDR(list,root);
      
      int[] res=new int[list.size()];
      for(int i=0;i<list.size();i++){
        res[i]=list.get(i);
      }
      return res;
    }

    public void LDR(ArrayList list,TreeNode res){
        if(res!=null){
            LDR(list,res.left);
            list.add(res.val);
            LDR(list,res.right);
        }
    }
}