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
        ListNode cntr = head;
        int cnt = 0;
        while(cntr != null){
            cnt++;
            cntr = cntr.next;
        }
        int pos = cnt - n;
        if(pos == 0) return head.next; 

        ListNode temp = head;
        while(--pos > 0){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
    }
}