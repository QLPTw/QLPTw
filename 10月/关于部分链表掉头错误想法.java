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
     * @param m int整型 
     * @param n int整型 
     * @return ListNode类
     */
    public ListNode reverseBetween (ListNode head, int m, int n) {
        // write code here
        if(head==null||m==n){
            return head;
        }

        ListNode temp=head,temp02;
        ListNode newList;
        int len=0;
        while(temp.next!=null){
            temp=temp.next;
            len++;
        }
        
        newList=new ListNode(temp.val);
        System.out.print(temp.val);
        temp02=newList;
        for(int i=len-1;i>=0;i--){
            temp=head;
            for(int j=i;j>0;j--){
                temp=temp.next;
            }
            temp02.next=new ListNode(temp.val);
            System.out.print(temp.val);
            temp02=temp02.next;
        }
        temp=head;
        temp02=newList;

    for(int i=1;i<=len+1;i++){
        if(i>=m&&i<=n){
            temp.val=temp02.val;
        }
        temp=temp.next;
        temp02=temp02.next;
    }



    return head;
    }
}