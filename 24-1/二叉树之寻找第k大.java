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
     * @param k int整型 
     * @return int整型
     */
    public void popo(ArrayList<Integer> list,TreeNode root){
        if(root==null){
            return;
        }
        popo(list,root.left);
        list.add(root.val);
        popo(list,root.right);
    }
    public int kthLargest (TreeNode root, int k) {
        // write code here
        if(root==null){
            return -1;
        }
        ArrayList<Integer> list=new ArrayList();
        popo(list,root);
        int[] res=new int[list.size()];
        for(int i=0;i<list.size();i++){
            res[i]=list.get(i);
        }
        Arrays.sort(res);
        return res[list.size()-k];
    }
}