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
     * @param head ListNode类 the head
     * @return bool布尔型
     */
    public boolean isPail (ListNode head) {
        // write code here
        if(head==null||head.next==null){
            return true;
        }
        ListNode res,temp=head;
        ArrayList<Integer> list=new ArrayList<>();
        //将链表输入到集合中
        while(temp!=null){
            list.add(temp.val);
            temp=temp.next;
        }
        res=res(head);
        for(int i=0;i<list.size()/2;i++){
            if(res.val!=list.get(i)){
                return false;
            }
            res=res.next;
        }

        return true;
    }
    public ListNode res(ListNode head){
        ListNode cur=null;
        while(head!=null){
            ListNode temp=head.next;
            head.next=cur;
            cur=head;
            head=temp;      
        }
        return cur;
    }
}