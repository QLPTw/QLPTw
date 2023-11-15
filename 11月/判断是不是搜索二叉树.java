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
     public boolean pool=true;
     
    public boolean isValidBST (TreeNode root) {
        // write code here
        if(root==null){
            return true;
        }
        ArrayList<Integer> list=new ArrayList();
        PanTree(list,root);
        for(int i=0;i<list.size()-1;i++){
            if(list.get(i)>list.get(i+1)){
                return false;
            }
        }

        return pool;
    }
    public void PanTree(ArrayList<Integer> list,TreeNode root){
        if(root==null){
            return;
        }
        PanTree(list,root.left);
        list.add(root.val);
        PanTree(list,root.right); 
    }
    
}