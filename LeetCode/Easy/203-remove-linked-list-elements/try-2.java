/*
 * Problem #203: Remove Linked List Elements
 * Difficulty: Easy
 * Submission: Try 2
 * status: Accepted
 * Language: java
 * Date: 4/9/2026, 7:29:18 AM
 * Link: https://leetcode.com/problems/remove-linked-list-elements/
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
   public ListNode removeElements(ListNode head, int val) {
     if(head==null){
            return head;
        }
        head.next=removeElements(head.next, val);
        if(head.val==val){
            return head.next;
        }
        else{
            return head;
        }   
}}
