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
    public ListNode deleteDuplicates (ListNode head) {
        // write code here
        if (head == null || head.next == null) {
            return head;
        }
        HashSet<Integer> set = new HashSet<>();
        //设定前后指针
        ListNode cur = head, pre = null;
        while (cur != null) {
            if (set.contains(cur.val)) {
                if (pre == null) {
                    cur=cur.next;
                    head=cur;
                } else {
                    cur = cur.next;
                    pre.next = cur;
                }
                continue;
            }
            set.add(cur.val);
            pre = cur;
            cur = cur.next;
        }
        return head;
    }
}