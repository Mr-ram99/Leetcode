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
    public void reorderList(ListNode head) {
        if(head==null || head.next==null)
            return;
        ListNode mid = getMid(head);
        ListNode A = mid;
        mid = reverse(mid);
        while(mid!=null) 
        {
          ListNode temp=head.next;
            ListNode temp2 = mid.next;
            head.next = mid;
            if(mid.next!=null)
            mid.next = temp;
            head = temp;
            mid = temp2;
            
        }
    }
    public static ListNode getMid(ListNode node)
    {
        if(node==null || node.next==null)
            return node;
        ListNode slow = node;
        ListNode fast = node;
        do{
            slow = slow.next;
            fast = fast.next.next;
        }while(fast!=null && fast.next!=null);
        return slow;
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