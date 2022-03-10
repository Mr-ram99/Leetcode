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
        if(l1 == null)
            return l2;
        if(l2 == null)
            return l1;
        ListNode head = new ListNode();
        ListNode cur = head;
        int sum=0, carry=0;
        while(l1!=null && l2!=null){
            sum = l1.val + l2.val + carry;
            if(sum>=10){
                sum -= 10;
                carry =1;
            }
            else{
                carry=0;
            }
            ListNode temp = new ListNode(sum);
            cur.next = temp;
            cur = temp;
            
            l1 = l1.next;
            l2 = l2.next;
        }
        while(l1!=null){
            sum = l1.val + carry;
            if(sum>=10){
                sum -= 10;
                carry =1;
            }
            else{
                carry=0;
            }
            ListNode temp = new ListNode(sum);
            cur.next = temp;
            cur = temp;
            l1 = l1.next;
        }
        while(l2!=null){
            sum = l2.val + carry;
            if(sum>=10){
                sum -= 10;
                carry =1;
            }
            else{
                carry=0;
            }
            ListNode temp = new ListNode(sum);
            cur.next = temp;
            cur = temp;
            l2 = l2.next;
        }
        if(carry == 1){
            ListNode temp = new ListNode(1);
            cur.next = temp;
        }
        return head.next;
    }
}