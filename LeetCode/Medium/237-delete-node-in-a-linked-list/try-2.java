/*
 * Problem #237: Delete Node in a Linked List
 * Difficulty: Medium
 * Submission: Try 2
 * status: Accepted
 * Language: java
 * Date: 9/8/2026, 10:13:45 PM
 * Link: https://leetcode.com/problems/delete-node-in-a-linked-list/
 */

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
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
