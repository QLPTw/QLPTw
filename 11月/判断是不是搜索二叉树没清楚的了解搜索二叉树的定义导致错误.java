//你的代码实现了对二叉搜索树的验证，但是在验证的逻辑上存在问题。
//首先，你使用了一个全局变量 pool 来记录验证结果，这种做法不推荐，因为全局变量会增加代码的复杂性和可维护性。
// 我建议将 pool 变量定义在 isValidBST 方法内部，并将其作为递归方法 TreeFind 的返回值。这样可以避免全局变量对代码的影响。
//其次，在 isValidBST 方法中，你使用了一个 ArrayList 来存储二叉树的节点值，并且通过遍历列表来检查是否有逆序。
// 然而，这种做法并不能完全验证二叉搜索树的正确性。因为只有节点值的大小顺序是有序的，才能保证整个二叉树是二叉搜索树。
// 你需要考虑到二叉搜索树的定义，即左子树所有节点的值均小于根节点的值，右子树所有节点的值均大于根节点的值。
// 所以应该在遍历的过程中比较当前节点和前驱节点的大小关系。
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
        TreeFind(list,root);
        for(int i=0;i<list.size()-1;i++){
            if(list.get(i)<list.get(i+1)){
                pool=false;
                break;
            }
        }
        return pool;
    }
    public void TreeFind(ArrayList<Integer> list,TreeNode root){
        if(root==null){
            return;
        }
        list.add(root.val);
        TreeFind(list,root.left);
        TreeFind(list,root.right);
    }
}