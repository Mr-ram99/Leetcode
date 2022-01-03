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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null || head.next==null)
            return null;
        int len = 0;
        ListNode temp = head;
        while(temp!=null)
        {
            temp = temp.next;
            len++;
        }
        int t = len-n;
        if(t==0)
            return head.next;
        temp =head;
        ListNode pre = new ListNode();
        while(t-->0)
        {
            pre = temp;
            temp = temp.next;
        }
        pre.next = temp.next;
        return head;
    }
}