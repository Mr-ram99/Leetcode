/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        if(head==null || head.next==null)
            return head;
         ListNode temp = head;
        if(head.next.next == null)
        {
            temp = head;
            head = head.next;
            head.next = temp;
            temp.next = null;
            return head;
        }
        ListNode pre1 = null;
        ListNode cur1 = head;
        ListNode pre2 = null;
        ListNode cur2 = head;
        ListNode nxt1 = cur1.next;
        ListNode nxt2 = cur2.next;
        
       
        int len=0;
        while(temp!=null)
        {
            len++;
            temp= temp.next;
        }
        if(k*2-1==len)
            return head;
        int i=k-1;
        while(i-->0)
        {
            pre1 = cur1;
            cur1 = cur1.next;
            nxt1 = cur1.next;
        }
        
        int j=len-k;
        while(j-->0)
        {
            pre2 = cur2;
            cur2 = cur2.next;
            nxt2 = cur2.next;
        }
        if(cur1.next==cur2)
        {
            if(pre1!=null)
                pre1.next = cur2;
            cur2.next = cur1;
            cur1.next = nxt2;
            return head;
        }
        if(cur2.next==cur1)
        {
            if(pre2!=null)
                pre2.next = cur1;
            cur1.next = cur2;
            cur2.next = nxt1;
            return head;
        }
        if(k==1)
        {
            pre2.next = cur1;
            cur2.next = cur1.next;
            cur1.next = null;
            return cur2;
        }
        if(k==len)
        {
            pre1.next = cur2;
            cur1.next = cur2.next;
            cur2.next = null;
            return cur1;
        }
        pre1.next = cur2;
        cur2.next = nxt1;
        pre2.next = cur1;
        cur1.next = nxt2;
        return head;
    }
}