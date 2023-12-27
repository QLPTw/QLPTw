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
     * @param x int整型 
     * @return ListNode类
     */
    public ListNode cow_partition (ListNode head, int x) {
        // write code here
        if(head==null||head.next==null){
            return head;
        }
        ListNode res=new ListNode(-1);
        res.next=head;
        ListNode pre=res,cur=head;
        ListNode latter=new ListNode(-1),la=latter;
        while(cur!=null){
            if(cur.val<x){
                ListNode temp=cur.next;
                pre.next=cur;
                cur.next=null;
                pre=cur;
                cur=temp;
            }else{
                ListNode temp=cur.next;
                la.next=cur;
                cur.next=null;
                la=la.next;
                cur=temp;
            }
        }
        pre.next=latter.next;
        return res.next;
    }
}