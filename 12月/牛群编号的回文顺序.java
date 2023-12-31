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
    public boolean popo(ArrayList<Integer> list, int i, int j) {
        while(i>=0&&j<list.size()){
            if(list.get(i)!=list.get(j)){
                return false;
            }
            i--;
            j++;
        }
        if(i>=0||j<list.size()){
            return false;
        }
        return true;
    }
    public boolean isPalindrome (ListNode head) {
        // write code here
        if (head == null) {
            return false;
        }
        ArrayList<Integer> list = new ArrayList();
        while(head!=null){
            list.add(head.val);
            head=head.next;
        }
        if(list.size()==1){
            return true;
        }
        int i=list.size()/2;
        if (popo(list,i-1,i)||popo(list,i-1,i)) {
            return true;
        }
        return false;
    }
}