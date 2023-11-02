import java.util.*;
/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Solution {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        HashSet<ListNode> sum = new HashSet<>();
        //设置一个指针
        ListNode temp01 = pHead1;
        //将第一个链表先行插入到HashSet中
        while (temp01 != null) {
            sum.add(temp01);
            temp01 = temp01.next;
        }
        ListNode temp02 = pHead2;
        while (temp02 != null) {
            if (sum.contains(temp02)) {
                return temp02;
            }
            temp02 = temp02.next;
        }
        return null;
    }
}
