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
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null)
            return head;
        ListNode cur = head.next;
        ListNode pre = head;
        int i=1;
        while(cur!=null){
            if(pre.val<=cur.val)
            {
                pre = cur;
                cur = cur.next;
                i++;
                continue;
            }
            ListNode temp = head;
            ListNode pretemp = null;
            int j=0;
            while(j<i && temp.val<=cur.val){
                pretemp = temp;
                temp = temp.next;
                j++;
            }
            if(i==j){
                pre = cur;
                cur = cur.next;
                i++;
                continue;
            }
            if(temp == head){
                pre.next = cur.next;
                cur.next = temp;
                head = cur;
            }
            else
            {
                pre.next = cur.next;
                cur.next = temp;
                pretemp.next = cur;
            }
            cur = pre.next;
            i++;
        }
        return head;
    }
}