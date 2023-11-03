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
     * @param head1 ListNode类
     * @param head2 ListNode类
     * @return ListNode类
     */
    public ListNode addInList (ListNode head1, ListNode head2) {
        // write code here
        if(head1==null||head2==null){
            return head1==null?head2:head1;
        }
        ListNode temp01 = res(head1);
        ListNode temp02 = res(head2);
        head1=temp01;head2=temp02;
        int sum = 0;
        boolean DS=false;
        ListNode res01=new ListNode(-1);
        ListNode head=res01;
        while (temp01!=null||temp02!=null){
            sum=0;
            if(DS){
                sum+=1;
                DS=false;
            }
            if(temp01!=null){
                sum+=temp01.val;
                temp01=temp01.next;
            }
            if(temp02!=null){
                sum+=temp02.val;
                temp02=temp02.next;
            }
            if(sum>9){
                DS=true;
                sum-=10;
            }
            res01.next=new ListNode(sum);
            res01=res01.next;
        }
        head1=res(head.next);
            return head1;
    }

    public static ListNode res(ListNode head) {
        ListNode cur = null;
        while (head != null) {
            ListNode temp = head.next;
            head.next = cur;
            cur = head;
            head = temp;
        }
        return cur;
    }
}