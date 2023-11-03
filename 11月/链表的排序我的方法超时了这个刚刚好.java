import java.util.*;

/*
 * public class ListNode {
 *   int val;
 *   ListNode next = null;
 * }
 */

public class Solution {
    /**
     *
     * @param head ListNode类 the head node
     * @return ListNode类
     */
    public ListNode sortInList (ListNode head) {
        // write code here
        List<Integer> nums = new ArrayList<>();
        ListNode dummyHead = new ListNode(-1); //虚拟头结点
        while (head != null) {
            nums.add(head.val);
            head = head.next;
        }
        quickSort(nums, 0, nums.size() - 1);
        ListNode cur = dummyHead;
        for (int x : nums) {
            ListNode temp = new ListNode(x);
            cur.next = temp;
            cur = cur.next;
        }
        return dummyHead.next;
    }
    private void quickSort(List<Integer> nums, int left, int right) {
        if (left < right) {
            int i = left, j = right;
            int temp = nums.get(i); //比较的基准值，一般取最左边的数
            while (i < j) {
                while (i < j && nums.get(j) >= temp) {
                    j--;
                }
                if (i < j) {
                    nums.set(i, nums.get(j));
                    i++;
                }
                while (i < j && nums.get(i) <= temp) {
                    i++;
                }
                if (i < j) {
                    nums.set(j, nums.get(i));
                    j--;
                }
            }
            nums.set(i,
                     temp); //将基准值放在中间位置，此时它的左边都小于它，右边都大于它
            quickSort(nums, left, i - 1);
            quickSort(nums, i + 1, right);
        }

    }
}