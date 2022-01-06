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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null || k==0)
            return head;
        ListNode dummyhead=head;
        ListNode temp=head;
        int len=0;
        while(temp!=null)
        {
            temp=temp.next;
            len++;
        }
        if(k==len)
            return head;
        k=k%len;
        int i=len-k-1;
        temp=head;
        while(i-->0)
        {
            temp=temp.next;
        }
        head=temp.next;
        temp.next=null;
        temp=head;
        if(temp==null)
            return dummyhead;
        while(temp.next!=null)
            temp=temp.next;
        temp.next=dummyhead;
        return head;
    }
}