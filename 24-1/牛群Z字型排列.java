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
     * @return int整型二维数组
     */
    public int[][] ZLevelOrder (TreeNode root) {
        if (root == null) {
            return new int [0][0];
        }
        LinkedList<TreeNode> linkedList = new LinkedList<>();
        ArrayList<ArrayList<Integer>> arrayLists = new ArrayList<>();
        linkedList.add(root);
        int flag = 1;
        while (!linkedList.isEmpty()) {
            ArrayList<Integer> arrayList = new ArrayList<>();
            for (TreeNode treeNode : linkedList) {
                arrayList.add(treeNode.val);
            }
            if (flag % 2 == 0) {
                Collections.reverse(arrayList);
                arrayLists.add(arrayList);
            } else {
                arrayLists.add(arrayList);
            }
            flag++;
            int size = linkedList.size();
            while (size-- > 0) {
                TreeNode node = linkedList.poll();
                if (node.left != null) {
                    linkedList.add(node.left);
                }
                if (node.right != null) {
                    linkedList.add(node.right);
                }
            }
        }
        // 将列表转换为二维数组
        int[][] array = new int[arrayLists.size()][];
        for (int i = 0; i < arrayLists.size(); i++) {
            List<Integer> sublist = arrayLists.get(i);
            int [] temp = new int[sublist.size()];
            for (int j = 0; j < sublist.size(); j++) {
                temp[j] = sublist.get(j);
            }
            array[i] = temp;
        }

        return array;
    }
}
