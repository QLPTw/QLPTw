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
     * @return bool布尔型
     */
    public boolean hasCycle (ListNode head) {
        // write code here
        ListNode pre,cur;
        HashSet<Integer> set=new HashSet();
        while(head!=null){
            if(set.contains(head.val)){
                return true;
            }
            set.add(head.val);
            head=head.next;
        }

        return false;
    }
}