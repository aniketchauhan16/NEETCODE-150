/*
 * Problem #141: Linked List Cycle
 * Difficulty: Easy
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 9/11/2026, 11:07:52 AM
 * Link: https://leetcode.com/problems/linked-list-cycle/
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
    public boolean hasCycle(ListNode head) {
        HashMap<ListNode , Integer> hm = new HashMap<>();
        ListNode temp = head;

        while(temp != null){
            if(hm.containsKey(temp)){
                return true;
            }
            hm.put(temp , 1);
            temp = temp.next;
        }
        return false;
    }
}
