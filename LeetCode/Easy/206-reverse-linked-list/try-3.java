/*
 * Problem #206: Reverse Linked List
 * Difficulty: Easy
 * Submission: Try 3
 * status: Accepted
 * Language: java
 * Date: 10/10/2026, 9:41:27 AM
 * Link: https://leetcode.com/problems/reverse-linked-list/
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
    public ListNode reverseList(ListNode head) {
        ListNode last = null;
        ListNode curr = head;
        // ListNode temp = curr.next;
        while(curr != null){
            ListNode temp = curr.next;
            curr.next = last;
            last = curr;
            curr = temp;
        }
    return last;
    }
}
