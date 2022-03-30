/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        ListNode pre = null;
        while(node.next!=null){
            node.val = node.next.val;
            pre = node;
            node = node.next;
        }
        if(pre!=null)
            pre.next = null;
    }
}