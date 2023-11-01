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
     * @param lists ListNode类ArrayList
     * @return ListNode类
     */
    public ListNode mergeKLists (ArrayList<ListNode> lists) {
        // write code here
        if (lists.size() == 0) {
            return null;
        }
        ListNode newList = lists.get(0);
        for (int i = 1; i < lists.size(); i++) {
            newList = Merge(lists.get(i), newList);
        }
        return newList;
    }

    public static ListNode Merge(ListNode head01, ListNode head02) {
        if (head01 == null || head02 == null) {
            return head01 == null ? head02 : head01;
        }
        if(head01.val<=head02.val){
            head01.next=Merge(head01.next,head02);
            return head01;
        }
        if(head02.val<head01.val){
            head02.next=Merge(head01,head02.next);
            return head02;
        }    
        return null;
    }
}