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
     * @return ListNode类
     */
    public ListNode oddEvenList (ListNode head) {
        // write code here
        if(head==null||head.next==null){
            return head;
        }
        //设立两个链表奇偶
        ListNode odd=new ListNode(-1);
        ListNode even=new ListNode(-1);
        ListNode temp01=odd,temp02=even;
        int ce=0;
        while(head!=null){
            if((head.val&1)==1){
                temp01.next=head;
                head=head.next;
                temp01=temp01.next;
            }else{
                temp02.next=head;
                head=head.next;
                temp02=temp02.next;
            }
        }
        temp01.next=even.next;
        temp02.next=null;
        return odd.next;
    }
}