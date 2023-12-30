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

     // 找到中间节点的前驱节点
    private ListNode getMidNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null && fast.next.next != null) {
            slow = slow.next; 
            fast = fast.next;
        }

        return slow;
    }

    // 合并两个已排序的链表
    private ListNode merge(ListNode l1, ListNode l2) {
        if (l1 == null || l2 == null) return l1 == null ? l2 : l1;

        ListNode newHead = new ListNode(-1);
        ListNode tmp = newHead;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                tmp.next = l1;
                l1 = l1.next;
            } else {
                tmp.next = l2;
                l2 = l2.next;
            }
            tmp = tmp.next;
        }

        if (l1 != null) tmp.next = l1;
        if (l2 != null) tmp.next = l2;

        return newHead.next;
    }

    public ListNode sortList (ListNode head) {
        // write code here
        // 1. 递归结束的条件
        if (head == null || head.next == null) {
            return head;
        }

        //2， 获取到中间节点的前驱节点
        ListNode mid = getMidNode(head);
        ListNode two = mid.next; // 第二段链表的头节点
        mid.next = null; // 将第一段链表的尾节点置空
       
        // 3. 开始递归
        ListNode left = sortList(head);
        ListNode right = sortList(two);
        // 4. 开始合并
        return merge(left,right);
    }
}
