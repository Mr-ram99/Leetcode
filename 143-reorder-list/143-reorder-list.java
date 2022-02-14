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
        if(head == null || head.next == null)
            return ;
        ListNode slow = head;
        ListNode pre = new ListNode();
        ListNode fast = head;
        while(fast!=null && fast.next!=null)
        {
            pre = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        pre.next = null;
        ListNode mid = slow;
        ListNode node = head;
        mid = reverse(mid);
        ListNode temp, temp2;
        while(node!=null){
            temp = node.next;
            node.next = mid;
            temp2 = mid.next;
            node = temp;
            if(node == null)
                return;
            mid.next = temp;
            mid = temp2;
        }
            
    }
    public static ListNode reverse(ListNode root){
        if(root == null || root.next == null)
            return root;
        ListNode pre = null;
        ListNode cur = root;
        ListNode nxt = root.next;
        while(nxt!=null){
            cur.next = pre;
            pre = cur;
            cur = nxt;
            nxt = nxt.next;
        }
        cur.next = pre;
        return cur;
    }
}