import java.util.*;

public class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) {
            return null;
        }
        ListNode res = new ListNode(-1);
        res.next=lists[i];
        ListNode head = res, end = head;
        for (int i = 1; i < lists.length; i++) {
            head = res;
            while (end.next != null) {
                end = end.next;
            }
            if (end.val <= lists[i].val) {
                end.next = lists[i];
            } else {
                while (lists[i] != null) {
                    while (lists[i].val < head.next.val) {
                        head = head.next;
                    }
                    ListNode temp = lists[i].next;
                    lists[i].next = head.next;
                    head.next = lists[i];
                    lists[i] = temp;
                }
            }
        }
        return res.next;
    }
}