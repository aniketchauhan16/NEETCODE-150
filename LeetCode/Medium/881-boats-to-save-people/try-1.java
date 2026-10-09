/*
 * Problem #881: Boats to Save People
 * Difficulty: Medium
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 9/7/2026, 2:06:06 PM
 * Link: https://leetcode.com/problems/boats-to-save-people/
 */

class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        
        int left = 0; int right = people.length-1;
        int boatcnt = 0; 
        
        while(left <= right){
            if(people[left] + people [right] <= limit){
                left++; right--; boatcnt++;
            }
            else{
                right--; boatcnt++;
            }
        }
        return boatcnt;
    }
}
