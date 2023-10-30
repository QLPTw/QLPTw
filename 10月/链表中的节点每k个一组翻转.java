import java.util.*;

/*
 * public class ListNode {
 *   int val;
 *   ListNode next = null;
 *   public ListNode(int val) {
 *     this.val = val;
 *   }
 * }
 */

public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * 
     * @param head ListNode类 
     * @param k int整型 
     * @return ListNode类
     */
    public ListNode reverseKGroup (ListNode head, int k) {
        // write code here
        //找到每次翻转的尾部
        ListNode tail=head;
        //遍历k次到尾部
        for(int i=0;i<k;i++){
            if(tail==null){
                return head;
            }
            tail=tail.next;
        }
        //翻转时需要的前节点和当前节点
        ListNode pre=null;
        ListNode cur=head;
        //具体翻转细节
        while(cur!=tail){
            ListNode temp=cur.next;
            cur.next=pre;
            pre=cur;
            cur=temp;
        }
        head.next=reverseKGroup(tail,k);
        return pre;
    }
}