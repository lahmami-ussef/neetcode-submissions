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
        // Pass 1: count the length
        int length = 0;
        ListNode current = head;
        while (current != null) {
            length++;
            current = current.next;
        }

        // Dummy node handles the case of removing the head
        ListNode dummy = new ListNode(0, head);

        // Pass 2: walk to the node just BEFORE the target
        current = dummy;
        for (int i = 0; i < length - n; i++) {
            current = current.next;
        }

        // Skip the target node
        current.next = current.next.next;

        return dummy.next;
    }
}
