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
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null || head.next.next==null)
            return head;
        ListNode tail = head;
        while(tail.next!=null)
        {
            tail = tail.next;
        }
        ListNode odd = head;
        ListNode even = head.next;
        ListNode end = tail;
        while(odd!=end && odd.next!=end)
        {
            odd.next = even.next;
            odd = odd.next;
            even.next=null;
            tail.next = even;
            tail = tail.next;
            even = odd.next;
        }
        if(odd.next == end)
        {
            odd.next = even.next;
            odd = odd.next;
            even.next=null;
            tail.next = even;
            tail = tail.next;
        }
        return head;
    }
}