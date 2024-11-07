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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int i = 0;
        ListNode node = head;
        ListNode n2 = head;
        int sz;

        for(sz = 1; node.next != null; sz++, node = node.next);

        n2 = head;
        node = head.next;

        for(i = 0, node = head; i < sz-n; i++, n2 = node, node = node.next);

        if(sz == n){
            head = head.next;
        }
        else{
            n2.next = node.next;
        }
                
        return head;
    }
}