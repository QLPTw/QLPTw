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
     * @param pHead ListNode类 
     * @param k int整型 
     * @return ListNode类
     */
    public ListNode FindKthToTail (ListNode pHead, int k) {
        // write code here
        int len=0;
        ListNode head=pHead;
        while(pHead!=null){
            len++;
            pHead=pHead.next;
        }
      

        pHead=head;
        if(k>len){
            return null;
        }
        for(int i=0;i<len-k;i++){
            
            pHead=pHead.next;
        }

        return pHead;
    }
}