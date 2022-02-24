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
    public ListNode mergeNodes(ListNode head) {
        ListNode pre = null;
        ListNode cur = head.next;
        int sum=0;
        while(cur!=null){
            if(cur.val!=0){
                sum+=cur.val;
                cur = cur.next;
            }
            else{
                    ListNode temp = new ListNode(sum);
                    if(pre==null){
                        head = temp;
                        pre = head;
                    }
                    else{
                        pre.next = temp;
                        pre = temp;
                    }
                    cur = cur.next;
                    sum=0;
                
            }
        }
        return head;
    }
}