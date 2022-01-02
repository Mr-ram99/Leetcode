/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null)
            return null;
        if(headA.next == headB)
            return headB;
        if(headB.next == headA)
            return headA;
        int len1 = 0, len2 =0;
        ListNode temp1 = headA;
        ListNode temp2 = headB;
        while(temp1!=null)
        {
            temp1 = temp1.next;
            len1++;
        }
        while(temp2!=null)
        {
            temp2 = temp2.next;
            len2++;
        }
        temp1 = headA;
        temp2 = headB;
        while(len1>len2)
        {
            temp1 = temp1.next;
            len1--;
        }
        while(len2>len1)
        {
            temp2 = temp2.next;
            len2--;
        }
        while(temp1!=temp2 && temp1!=null && temp2!=null)
        {
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        if(temp1==temp2)
            return temp1;
        else
            return null;
    }
}