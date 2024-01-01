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
    public int popo(ArrayList<Integer> list, int i, int j) {
        int len = 0;
        while (i >= 0 && j < list.size()) {
            if (list.get(i) != list.get(j)) {
                break;
            }
            if (i == j) {
                len++;
            } else {
                len += 2;
            }
            i--;
            j++;
        }
        return len;
    }
    public ListNode maxPalindrome (ListNode head) {
        // write code here
        if (head == null || head.next == null) {
            return null;
        }
        ArrayList<Integer> list = new ArrayList();
        ListNode temp = head;
        while (temp != null) {
            list.add(temp.val);
            temp = temp.next;
        }
        int len = 0;
        int number = 0;
        for (int i = 0; i < list.size(); i++) {
            int templen = Math.max(popo(list, i, i), popo(list, i, i + 1));
            if (templen > len) {
                len = templen;
                number = i;
            }
        }
        if (len == list.size()) {
            return null;
        }
        temp = head;
        for (int i = 0; i <= number - len / 2; i++) {
            temp = temp.next;
        }
        ListNode res = temp;
        for (int i = 0; i < len - 1; i++) {
            temp = temp.next;
        }
        temp.next = null;
        return res;
    }
}
