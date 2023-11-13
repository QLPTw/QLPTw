import java.util.;


  public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;
    public TreeNode(int val) {
      this.val = val;
    }
  }
 

public class Solution {
    
      代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     
     
      @param root TreeNode类
      @param sum int整型
      @return bool布尔型
     
    public boolean hasPathSum (TreeNode root, int sum) {
         write code here
        if (root == null) {
            return false;
        }
        HashSetInteger set = new HashSet();
        TreeSum(set, root, 0);
        return set.contains(sum);
    }
    public void TreeSum(HashSetInteger set, TreeNode root, int fa) {
        if (root == null) {
            return;
        }
        fa = fa + root.val;
        if (root.right == null && root.left == null) {
            if (!set.contains(fa)) {
                set.add(fa);
            }
        }

        TreeSum(set, root.left, fa);
        TreeSum(set, root.right, fa);
    }
}