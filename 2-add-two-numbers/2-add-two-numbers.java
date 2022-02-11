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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int sum=0, carry=0;
        ListNode temp = new ListNode();
        ListNode head = temp;
        while(l1!=null && l2!=null)
        {
           sum = l1.val + l2.val + carry;
            if(sum>=10)
            {
                sum-=10;
                carry=1;
            }
            else 
                carry=0;
            ListNode cur = new ListNode(sum);
            temp.next = cur;
            temp = cur;
            l1 = l1.next;
            l2 = l2.next;
        }
        while(l1!=null)
        {
            sum = l1.val + carry;
            if(sum>=10)
            {
                sum-=10;
                carry=1;
            }
            else 
            {
                carry = 0;
            }
            ListNode cur = new ListNode(sum);
            temp.next = cur;
            temp = cur;
            l1 = l1.next;
        }
        while(l2!=null)
        {
            sum = l2.val + carry;
            if(sum>=10)
            {
                sum-=10;
                carry=1;
            }
            else 
            {
                carry=0;
            }
            ListNode cur = new ListNode(sum);
            temp.next = cur;
            temp = cur;
            l2 = l2.next;
        }
        if(carry==1)
        {
            ListNode cur = new ListNode(1);
            temp.next = cur;
        }
        return head.next;
    }
}