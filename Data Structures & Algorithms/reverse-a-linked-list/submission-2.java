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
    public ListNode reverseList(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        
        while(curr != null) {
            // Unlink curr node
            ListNode temp = curr.next;
            // re-assign new link to the node;
            curr.next = prev;
            // move prev to the curr node
            prev = curr;
            // assign and move curr to the next node
            curr = temp;
        }
        // return head
        return prev;
    }
}
