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
     * @return int整型
     */
    public void popo(TreeNode root,ArrayList<Integer> list){
        if(root==null){
            return;
        }
        list.add(root.val);
        popo(root.left,list);
        popo(root.right,list);
    }
    public int getMinimumDifference (TreeNode root) {
        // write code here
        if(root==null){
            return -1;
        }
        ArrayList<Integer> list=new ArrayList();
        popo(root,list);
        int len=list.size();
        int res=Math.abs(list.get(0)-list.get(1));
        for(int i=0;i<len;i++){
            for(int j=i+1;j<len;j++){
                int temp=Math.abs(list.get(i)-list.get(j));
                if(temp<res){
                    res=temp;
                }
            } 
        }
        return res;
    }
}