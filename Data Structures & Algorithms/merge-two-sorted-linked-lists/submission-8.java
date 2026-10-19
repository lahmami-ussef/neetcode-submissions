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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode cur_l1=list1;
        ListNode cur_l2=list2;
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        while(cur_l1!=null && cur_l2!=null)
        {
            if(cur_l1.val <= cur_l2.val)
            {
                tail.next=cur_l1;
                cur_l1=cur_l1.next;
            }
            else{
                tail.next=cur_l2;
                cur_l2=cur_l2.next;
            }
            tail=tail.next;
        }
        if(cur_l1!=null)
        {
            tail.next=cur_l1;
        }else{
            tail.next=cur_l2;
        }
        return dummy.next;
    }
}