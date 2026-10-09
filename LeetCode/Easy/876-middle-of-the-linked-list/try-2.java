/*
 * Problem #876: Middle of the Linked List
 * Difficulty: Easy
 * Submission: Try 2
 * status: Accepted
 * Language: java
 * Date: 9/10/2026, 1:19:08 PM
 * Link: https://leetcode.com/problems/middle-of-the-linked-list/
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
    public ListNode middleNode(ListNode head) {
        ListNode temp = head;
        int cnt = 0;
        while(temp != null ){
            cnt++;
            temp = temp.next;
        }
        int n = cnt/2 ;
        
        ListNode newNode = head;
        while( n!= 0){
            newNode = newNode.next;
            n--;
        }
        return newNode;       
    }
}
