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
    public int pairSum(ListNode head) {
        if(head.next.next==null)
            return head.val+head.next.val;
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode mid = reverse(slow);
        int max=0;
        while(mid!=null)
        {
            if(max<mid.val+head.val)
                max = mid.val + head.val;
            mid = mid.next;
            head= head.next;
        }
        return max;
    }
    public static ListNode reverse(ListNode node)
    {
        ListNode pre = null;
        ListNode cur = node;
        ListNode nxt = cur.next;
        while(nxt!=null)
        {
            cur.next = pre;
            pre = cur;
            cur = nxt;
            nxt = nxt.next;
        }
        cur.next = pre;
        return cur;
    }
}