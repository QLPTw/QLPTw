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
     * @param lists ListNode类ArrayList 
     * @return ListNode类
     */
    public ListNode mergeKLists (ArrayList<ListNode> lists) {
        // write code here
        if(lists==null){
            return null;
        }

        ListNode newlist=null;
        
        for(int i=0;i<lists.size();i++){
            newlist=Merge(newlist,lists.get(i));
        }

        return newlist;
    }
    
    public static ListNode Merge(ListNode head01,ListNode head02){
        if(head01==null||head02==null){
            return head01==null?head02:head01;
        }

        ListNode temp=null,pre=null,cur=head01;

        while(head02!=null){
            while(cur!=null){
                if(head02.val<cur.val){
                    break;
                }
                pre=cur;
                cur=cur.next;
            }

            if(pre==null){
                temp=head02;
                head02=head02.next;
                temp.next=head01;
                head01=temp;
            }else{
                pre.next=head02;
                pre=pre.next;
                head02=head02.next;
                pre.next=cur;
            }
        }

        return head01;
    }

}