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
    public ListNode sortCowsIV (ListNode head) {
        // write code here
        ListNode res=new ListNode(-1);
        ListNode temp=res;
        int len=0;int end=0;
        while(head!=null){
            len++;
            if(head.val==0){
                end++;
            }
            head=head.next;
        }
        for(int i=0;i<end;i++){
            temp.next=new ListNode(0);
            temp=temp.next;
        }
        for(int i=0;i<len-end;i++){
            temp.next=new ListNode(1);
            temp=temp.next;
        }
        return res.next;
    }
}