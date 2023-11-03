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
     * @param head1 ListNode类 
     * @param head2 ListNode类 
     * @return ListNode类
     */
    public ListNode addInList (ListNode head1, ListNode head2) {
        // write code here
        int len=0,len1=0,len2=0;
        if(head1==null||head2==null){
            return head1==null?head2:head1;
        }

        //计量长度的指针
        ListNode temp01=head1,temp02=head2;
        while(temp01!=null){
            temp01=temp01.next;
            len1++;
        }
        while(temp02!=null){
            temp02=temp02.next;
            len2++;
        }

        //做一个判断得出长的那个链表(长的在上，短的在下)
        if(len1>=len2){
            temp01=head1;temp02=head2;
        }else{
            len=len1;
            len1=len2;
            len2=len;
            temp01=head2;temp02=head1;
        }

        //搞一个头节点
        ListNode head=temp01;

        //先得出一个总链表
        for(int i=0;i<len1-len2;i++){
            temp01=temp01.next;           
        }      
        while(temp01!=null){           
            temp01.val=temp01.val+temp02.val;
// System.out.println("结果："+temp01.val);
            temp01=temp01.next;
            temp02=temp02.next;
        }

        //现在将这个得到的链表进行满十进一
        ListNode pre=new ListNode(0);
        ListNode cur=head;
        pre.next=cur;
        ListNode res=pre;
        ListNode response=head;

        for(int i=len1;i>0;i--){
            for(int j=i-1;j>0;j--){
                pre=cur;
                cur=cur.next;
            }
            if(cur.val>9){
                pre.val=pre.val+1;
                cur.val=cur.val-10;
                if(i==1){
                    response=res;
                }
            }
            pre=res;
            cur=head;
        }

        return response;
    }


}