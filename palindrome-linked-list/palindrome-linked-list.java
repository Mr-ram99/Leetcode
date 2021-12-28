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
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null)
            return true;
        ListNode mid = getMid(head);
        ListNode temp = head;
        ListNode tail = reverse(mid);
        while(tail!=null)
        {
            if(head.val!=tail.val)
                return false;
            head = head.next;
            tail = tail.next;
        }
        return true;
    }
    public static ListNode getMid(ListNode node)
    {
        ListNode slow = node;
        ListNode fast = node;
        do{
            slow = slow.next;
            fast = fast.next.next;
        }while(fast!=null &&fast.next!=null);
        
        return slow;
    }
    public static ListNode reverse(ListNode node)
    {
        if(node==null || node.next ==null)
            return node;
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
