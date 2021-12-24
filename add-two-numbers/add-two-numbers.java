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
        ListNode head = new ListNode();
        ListNode dummyhead = head;
        int sum,carry=0;
        while(l1!=null || l2!=null)
        {
            if(l1!=null && l2!=null)
            {
                sum = l1.val+l2.val+carry;
                l1=l1.next;
                l2=l2.next;
            }
            else if(l1!=null)
               { 
                sum = l1.val+carry;
           l1=l1.next; 
            }
            else
                {
                sum = l2.val+carry;
                l2=l2.next;
            }
            if(sum>=10)
            {
                carry = 1;
                sum = sum%10;
                
            }
            else
                carry = 0;
            ListNode temp = new ListNode();
            temp.val = sum;
            dummyhead.next = temp;
            dummyhead = temp;
        }
        if(carry==1)
        {
            ListNode temp = new ListNode();
            temp.val = 1;
            dummyhead.next = temp;
            dummyhead = temp;
        }
        return head.next;
            
    }
}