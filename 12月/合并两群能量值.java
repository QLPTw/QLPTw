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
     * @param l1 ListNode类 
     * @param l2 ListNode类 
     * @return ListNode类
     */
    public ListNode mergeEnergyValues (ListNode l1, ListNode l2) {
        // write code here
        if(l1==null||l2==null){
            return l1==null?l2:l1;
        }
        ListNode res=new ListNode(-1);
        ListNode cur=res;
        while(l1!=null||l2!=null){
            if(l1==null){
                cur.next=l2;
                l2=l2.next;
                cur=cur.next;

            }else if(l2==null){
                cur.next=l1;
                l1=l1.next;
                cur=cur.next;
            }else if(l1.val>l2.val){
                cur.next=l1;
                l1=l1.next;
                cur=cur.next;
            }else{
                cur.next=l2;
                l2=l2.next;
                cur=cur.next;
            }
        }
        cur.next=null;
        return res.next;
    }
}