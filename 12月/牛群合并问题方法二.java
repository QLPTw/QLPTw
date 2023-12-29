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
     * @param lists ListNode类一维数组
     * @return ListNode类
     */
    public ListNode mergeKLists (ListNode[] lists) {
        // write code here
        if (lists.length == 0) {
            return null;
        }
        ListNode res = new ListNode(-1);
        ListNode cur = res;
        int number = -1;
        while (pan(lists)) {
            ListNode temp = null;
            for (int i = 0; i < lists.length; i++) {
                if (lists[i] == null) {
                    continue;
                }
                if (temp == null) {
                    temp = lists[i];
                    number = i;
                } else if (lists[i].val < temp.val) {
                    temp = lists[i];
                    number = i;
                }
            }
            lists[number] = lists[number].next;
            cur.next = temp;
            temp.next = null;
            cur = cur.next;
        }
        return res.next;
    }
    boolean pan(ListNode[] lsits) {
        for (int i = 0; i < lsits.length; i++) {
            if (lsits[i] != null) {
                return true;
            }
        }
        return false;
    }
}