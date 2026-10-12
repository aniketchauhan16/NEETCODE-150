/*
 * Problem #142: Linked List Cycle II
 * Difficulty: Medium
 * Submission: Try 2
 * status: Accepted
 * Language: java
 * Date: 9/26/2026, 5:18:02 AM
 * Link: https://leetcode.com/problems/linked-list-cycle-ii/
 */

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head,slow = head;
        while(fast!= null && fast.next!= null){
            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow){
                slow = head;
                while(fast != slow){
                    fast = fast.next;
                    slow = slow.next;
                }
                return slow;
            }
        }
        return null;
    }
}
