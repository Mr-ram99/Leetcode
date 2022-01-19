/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        ListNode temp = head;
        int len=0;
        while(fast != null && fast.next != null)
        {
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow)
            {
                do{
                    slow = slow.next;
                    len++;
                }while(slow!=fast);
                break;
            }
        }
        if(len==0)
            return null;
        else
        {
            while(len-->0)
                temp = temp.next;
            ListNode cur = head;
            while(cur!=temp)
            {
                 cur = cur.next;
                temp = temp.next;
            }
        }
        return temp;
    }
}