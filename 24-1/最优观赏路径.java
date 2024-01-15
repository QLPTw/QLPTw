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
    public void popo(TreeNode root,ArrayList<Integer> list){
        if(root==null){
            return;
        }
        list.add(root.val);
        popo(root.right,list);
        popo(root.left,list);
    }
    public int[] inorderTraversal (TreeNode root) {
        // write code here
        ArrayList<Integer> list=new ArrayList();
        popo(root,list);
        int[] res=new int[list.size()];
        for(int i=0;i<list.size();i++){
            res[i]=list.get(i);
        }
        Arrays.sort(res);
        return res;
    }
}