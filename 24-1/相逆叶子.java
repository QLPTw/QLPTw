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
     * @param root1 TreeNode类 
     * @param root2 TreeNode类 
     * @return bool布尔型
     */
    public void popo(ArrayList<Integer> list, TreeNode root){
        if(root==null){
            return;
        }
        popo(list,root.left);
        list.add(root.val);
        popo(list,root.right);
    }
    public boolean leafSimilar (TreeNode root1, TreeNode root2) {
        // write code here
        if(root1==null||root2==null){
            return false;
        }
        ArrayList<Integer> list1=new ArrayList();
        ArrayList<Integer> list2=new ArrayList();
        popo(list1,root1);
        popo(list2,root2);
        for(int i=0,j=list2.size()-1;i<list1.size()&j>=0;j--,i++){
            if(list1.get(i)!=list2.get(j)){
                return false;
            }
        }

        return true;
    }
}