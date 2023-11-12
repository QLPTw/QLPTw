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
     * @return int整型ArrayList<ArrayList<>>
     */
    public ArrayList<ArrayList<Integer>> levelOrder (TreeNode root) {
        // write code here
        if (root == null) {
            return new ArrayList();
        }
        ArrayList<ArrayList<Integer>> list = new ArrayList();
        ArrayList<Integer> res = new ArrayList();
        res.add(root.val);
        list.add(res);
        traversal(list, root,1);
        return list;
    }

    public void traversal(List list, TreeNode node,int depend) {
        if (node.left != null || node.right != null) {
            ArrayList<Integer> res = new ArrayList();
            if (node.left != null && node.right != null) {
                res.add(node.left.val);
                res.add(node.right.val);
                res.addAll(list.get(depend));
                list.set(depend,res);
                traversal(list, node.left,depend+1);
                traversal(list, node.right,depend+1);
            } else if (node.left != null && node.right == null) {
                res.add(node.left.val);
                res.addAll(list.get(depend));
                list.set(depend,res);
                traversal(list, node.left,depend+1);
            } else {
                res.add(node.right.val);
                res.addAll(list.get(depend));
                list.set(depend,res);
                traversal(list, node.right,depend+1);
            }
        }
    }
}