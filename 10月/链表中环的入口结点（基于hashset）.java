import java.util.*;
/*
 public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
*/
public class Solution {

    public ListNode EntryNodeOfLoop(ListNode pHead) {
        HashSet<ListNode> set=new HashSet<>();
        ListNode temp=pHead;
        while(temp!=null){
            //如果该值存在于集合中则返回true
            if(set.contains(temp)){
                return temp;
            }
            set.add(temp);
            temp=temp.next;
        }
        return null;
    }
}
