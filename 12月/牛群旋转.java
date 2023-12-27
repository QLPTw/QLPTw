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
    public ListNode rotateLeft (ListNode head, int k) {
        // write code here
        if(head==null||head.next==null){
            return head;
        }
        int len=1;
        ListNode temp=head;
        while(temp.next!=null){
            temp=temp.next;
            len++;
        }
        k%=len;
        ListNode pre=temp,cur=head;
        pre.next=cur;
        for(int i=0;i<len-k;i++){
            pre=cur;
            cur=cur.next;
        }
        pre.next=null;
        return cur;
    }
}