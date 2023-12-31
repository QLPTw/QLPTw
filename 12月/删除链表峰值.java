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
    public ListNode deleteNodes (ListNode head) {
        // write code here
        if (head == null || head.next == null) {
            return head;
        }
        ListNode pre = head, cur = head.next;

        while (cur.next != null) {
            if (pre.val < cur.val && cur.val > cur.next.val) {
                cur = cur.next;
                pre.next = cur;
            } else {
                pre = cur;
                cur = cur.next;
            }
        }

        return head;
    }
}