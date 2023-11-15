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
//出错点：
//在 mergeTrees 方法中，你试图使用递归合并两个树。然而，在 NewTree 方法中，
// 你错误地将 root3 定义为局部变量，并尝试通过赋值来修改父节点的左右孩子。这是不起作用的，因为 Java 中的参数传递是按值传递的。
public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * 
     * @param t1 TreeNode类 
     * @param t2 TreeNode类 
     * @return TreeNode类
     */
    public TreeNode mergeTrees (TreeNode t1, TreeNode t2) {
        // write code here
        int sum=0;
        if(t1==null&&t2==null){
            return t1;
        }else if(t1==null||t2==null){
            sum=(t1==null?t2.val:t1.val);
        }else{
            sum=t1.val+t2.val;
        }
        TreeNode NewRoot=new TreeNode(sum);
        NewTree(t1,t2,NewRoot);
        return NewRoot;
    }
    public void NewTree(TreeNode root1,TreeNode root2,TreeNode root3){
        if(root1==null&&root2==null){
            return;
        }else if(root1==null||root2==null){
            root3=new TreeNode(root1==null?root2.val:root1.val);
        }else{
            root3=new TreeNode(root1.val+root2.val);
        }
        NewTree(root1.left,root2.left,root3.left);
        NewTree(root1.right,root2.right,root3.right);
        
    }
}