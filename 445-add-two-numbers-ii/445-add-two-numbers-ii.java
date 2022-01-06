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
        l1 = reverse(l1);
        l2 = reverse(l2);
        ListNode head = new ListNode();
        ListNode temp = head;
        int sum,carry=0;
        while(l1!=null && l2!=null)
        {
            sum = l1.val+l2.val+carry;
            if(sum>=10)
            {
                sum = sum-10;
                carry = 1;
            }
            else
                carry = 0;
            ListNode newNode = new ListNode(sum);
            temp.next = newNode;
            temp = temp.next;
            l1 = l1.next;
            l2 = l2.next;
        } 
        if(l1==null)
        {
            while(l2!=null && carry==1)
            {
                sum = l2.val+carry;
                if(sum>=10)
                {
                    sum = sum-10;
                    carry = 1;
                }
                else
                {
                    carry =0;
                }
                ListNode newNode = new ListNode(sum);
                temp.next = newNode;
                temp = temp.next;
                l2 = l2.next;
            }
            temp.next =l2;
        }
        else
        {
            while(l1!=null && carry==1)
            {
                sum = l1.val+carry;
                if(sum>=10)
                {
                    sum = sum-10;
                    carry = 1;
                }
                else
                {
                    carry =0;
                }
                ListNode newNode = new ListNode(sum);
                temp.next = newNode;
                temp = temp.next;
                l1 = l1.next;
            }
            temp.next = l1;
        }
        if(carry==1)
           {
            ListNode newNode = new ListNode(1);
            temp.next = newNode;
        }
        return reverse(head.next);
    }
    public static ListNode reverse(ListNode node)
    {
        ListNode pre= null;
        ListNode cur = node;
        ListNode nxt = cur.next;
        while(nxt!=null)
        {
            cur.next = pre;
            pre =cur;
            cur = nxt;
            nxt = nxt.next;
        }
        cur.next = pre;
        return cur;
    }
}