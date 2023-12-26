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
    public ListNode addEnergyValues (ListNode l1, ListNode l2) {
        // write code here
        if(l1==null||l2==null){
            return l1==null?l2:l1;
        }
        ListNode res=new ListNode(-1);
        ListNode pre=res;
        while(l1!=null||l2!=null){
            ListNode temp=new ListNode(0);
            if(pre.val>9){
                pre.val=pre.val-10;
                temp.val+=1;
            }
            if(l1==null){
                temp.val+=l2.val;
                pre.next=temp;
                pre=pre.next;
                l2=l2.next;
            }else if(l2==null){
                temp.val+=l1.val;
                pre.next=temp;
                pre=pre.next;
                l1=l1.next;
            }else{
                temp.val=temp.val+l1.val+l2.val;
                pre.next=temp;
                pre=pre.next;
                l1=l1.next;
                l2=l2.next;
            }
        }
        if(pre.val>9){
            pre.val-=10;
            pre.next=new ListNode(1);
        }

        return res.next;
    }
}