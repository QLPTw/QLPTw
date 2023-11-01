import java.util.*;

public class Solution {
    public ListNode Merge(ListNode pHead1, ListNode pHead2) {
        if (pHead1 == null || pHead2 == null) {
            return pHead1 == null ? pHead2 : pHead1;
        }

        ListNode temp = null;
        ListNode pre = null;
        ListNode cur = pHead1;

        while (pHead2 != null) {
            while (cur != null) {
                if (cur.val > pHead2.val) {
                    break;
                }
                pre = cur;
                cur = cur.next;
            }
            if (pre == null) {
                temp = pHead2;
                pHead2 = pHead2.next;
                temp.next = pHead1;
                pHead1 = temp;
            } else {
                pre.next = pHead2;
                pre = pre.next;
                pHead2 = pHead2.next;
                pre.next = cur;
            }
        }

        return pHead1;
    }
}