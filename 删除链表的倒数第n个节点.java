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
    public ListNode removeNthFromEnd (ListNode head, int n) {
        // write code here
        //计算链表总长
        int len=0;
        ListNode temp=head;
        while(temp!=null){
            len++;
            temp=temp.next;
        }
        if(n>=len){
            return n==len?head.next:null;
        }
        
        //设置删除需要的指针
        ListNode pre=head,cur=head;
        for(int i=0;i<len-n;i++){
            pre=cur;
            cur=cur.next;
        }
        pre.next=cur.next;
        return head;
    }
}