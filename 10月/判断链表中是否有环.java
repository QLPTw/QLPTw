import java.util.*;
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }
        //快慢指针
        ListNode fast = head;
        ListNode slow = head;
        //如果没有环的话快指针会先到达链表尾
        while(fast!=null&&fast.next!=null){
            //快指针移动两步
            fast=fast.next.next;
            //慢指针移动一步
            slow=slow.next;
            //如果两指针相遇则表示有环
            if(fast==slow){
                return true;
            }
        }
        return false;
    }
}