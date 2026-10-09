/*
 * Problem #19: Remove Nth Node From End of List
 * Difficulty: Medium
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 9/13/2026, 9:59:21 AM
 * Link: https://leetcode.com/problems/remove-nth-node-from-end-of-list/
 */

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
