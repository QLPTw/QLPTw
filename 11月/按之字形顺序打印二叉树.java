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
     * @return int整型ArrayList<ArrayList<>>
     */
    public ArrayList<ArrayList<Integer>> Print (TreeNode pRoot) {
        // write code here
        ArrayList<ArrayList<Integer>> relist = new ArrayList<>();
        if (pRoot == null) {
            return relist;
        }
        Ztree(relist, pRoot, 0);
        return relist;
    }

    public void Ztree(ArrayList<ArrayList<Integer>> list, TreeNode root, int level) {
        if (root == null) {
            return;
        }
        if (level >=list.size()) {
            list.add(new ArrayList<Integer>());
        }
        if ((level & 1) == 1) {
            list.get(level).add(0, root.val);
        } else {
            list.get(level).add(root.val);
        }

        Ztree(list, root.left, level + 1);
        Ztree(list, root.right, level + 1);
    }
}