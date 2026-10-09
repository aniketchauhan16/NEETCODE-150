/*
 * Problem #412: Fizz Buzz
 * Difficulty: Easy
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 4/16/2026, 9:19:38 PM
 * Link: https://leetcode.com/problems/fizz-buzz/
 */

class Solution {
    public List<String> fizzBuzz(int n) {
        ArrayList<String> list = new ArrayList<>();
        
        for(int i =1;i<=n;i++){

            if(i%3== 0 && i%5== 0){
              list.add("FizzBuzz");
                
            }
            
           else if (i%3 == 0 ){
                list.add("Fizz");
                
            }
           else if (i%5== 0){
                list.add("Buzz");
                
            }
            else {
                String str = Integer.toString(i);
                list.add(str);
                }
        }return list;
    }
}
