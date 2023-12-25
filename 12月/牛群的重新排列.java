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
     * @param left int整型 
     * @param right int整型 
     * @return ListNode类
     */
    public ListNode reverseBetween (ListNode head, int left, int right) {
        // write code here
        if(head==null||head.next==null||left>=right){
            return head;
        }
        ListNode res=new ListNode(-1);
        res.next=head;
        ListNode pre=res;
        ListNode cur=head;
        for(int i=1;i<left;i++){
            pre=cur;
            cur=cur.next;
        }
        for(int i=left;i<right;i++){
            ListNode temp=cur.next;
            cur.next=temp.next;
            temp.next=pre.next;
            pre.next=temp;
        } 
        return res.next;
    }
}