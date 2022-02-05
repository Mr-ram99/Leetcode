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
    public ListNode mergeKLists(ListNode[] lists) {
        int i;
        if(lists.length==0)
            return null;
        ListNode head = lists[0];
        for(i=1;i<lists.length;i++)
        {
            head = merge(head,lists[i]);
        }
        return head;
    }
    public static ListNode merge(ListNode node1, ListNode node2)
    {
        if(node1==null)
            return node2;
        if(node2==null)
            return node1;
        ListNode head;
        if(node1.val>node2.val)
        {
            head = node2;
            node2 = node2.next;
        }
        else
        {
            head = node1;
            node1 = node1.next;
        }
        ListNode temp = head;
        while(node1!=null && node2!=null)
        {
            ListNode cur = new ListNode();
            if(node1.val>node2.val)
            {
                cur.val = node2.val;
                node2 = node2.next;
            }
            else
            {
               cur.val = node1.val;
                node1 = node1.next;
            }
            temp.next = cur;
                temp = cur;
        }
        if(node1==null)
            temp.next = node2;
        else if(node2==null)
            temp.next = node1;
        return head;
    }
    
}