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
     * @param n int整型
     * @return ListNode类
     */
    public ListNode moveNthToEnd (ListNode head, int n) {
        // write code here
        if (head == null || head.next == null||n==1) {
            return head;
        }
        int len = 1,temp=0;
        ListNode cur = head, pre = head;
        while (cur.next != null) {
            cur = cur.next;
            len++;
        }
        if(len==n){
            cur.next=head;
            head=head.next;
            cur.next.next=null;
            return head;
        }
        cur=head;
        for(int i=0;i<len;i++){
            if(i==len-n){
                temp=cur.val;
                cur=cur.next;
                pre.next=cur;          
                continue;
            }
            if(i==len-1){
                cur.next=new ListNode(temp);
            }
            pre=cur;
            cur=cur.next;
        }   
        return head;
    }
}