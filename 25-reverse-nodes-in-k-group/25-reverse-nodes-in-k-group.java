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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null || head.next==null || k==1)
            return head;
        int len=0;
        ListNode temp = head;
        while(temp!=null)
        {
            len++;
            temp=temp.next;
        }
        int i=k;
        ListNode pre = null;
        ListNode cur = head;
        ListNode nxt = cur.next;
        if(k==len)
        {
            while(nxt!=null)
            {
                cur.next = pre;
                pre  = cur;
                cur = nxt;
                nxt = nxt.next;
            }
            cur.next = pre;
            return cur;
        }
        while(i<=len)
        {
            int j=k;
            ListNode first = cur;
            ListNode last = pre;
            while(j-->0 && nxt!=null)
            {
                cur.next = pre;
                pre = cur;
                cur = nxt;
                nxt = nxt.next;
            }
            if(nxt==null && len%k==0)
               {
                cur.next = pre;
                pre = cur;
                cur=null;
            }
            first.next = cur;
            if(last!=null)
            last.next = pre;
            if(i==k)
                head = pre;
            pre = first;
            i+=k;
        }
        return head;
    }
}