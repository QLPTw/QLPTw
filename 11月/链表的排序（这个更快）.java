import java.util.*;

/*
 * public class ListNode {
 *   int val;
 *   ListNode next = null;
 * }
 */

public class Solution {
    public ListNode sortInList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        
        ListNode middle = getMiddle(head);
        ListNode nextOfMiddle = middle.next;
        middle.next = null;
        
        ListNode left = sortInList(head);
        ListNode right = sortInList(nextOfMiddle);
        
        return merge(left, right);
    }
    
    private ListNode getMiddle(ListNode head) {
        if (head == null) {
            return head;
        }
        
        ListNode slow = head;
        ListNode fast = head;
        
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        return slow;
    }
    
    private ListNode merge(ListNode left, ListNode right) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        
        while (left != null && right != null) {
            if (left.val < right.val) {
                current.next = left;
                left = left.next;
            } else {
                current.next = right;
                right = right.next;
            }
            current = current.next;
        }
        
        if (left != null) {
            current.next = left;
        }
        
        if (right != null) {
            current.next = right;
        }
        
        return dummy.next;
    }
}

