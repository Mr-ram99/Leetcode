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
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null)
            return head;
        ListNode node1 = head;
        ListNode node2 = node1.next;
        head = node2;
        ListNode pre = null;
        ListNode nxt = node2.next;
        while(node1!=null && node2!=null)
        {
            if(pre!=null)
                pre.next = node2;
            nxt = node2.next;
            node2.next = node1;
            node1.next = nxt;
            pre=node1;
            node1 = nxt;
            if(node1==null)
                break;
            node2 = node1.next;
        }
        return head;
    }
}