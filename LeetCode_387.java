/*
 387. First Unique Character in a String
 https://leetcode.com/problems/first-unique-character-in-a-string/
  
   Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.
  
   Example 1:
   Input: s = "leetcode"
   Output: 0
  
   Example 2:
   Input: s = "loveleetcode"
   Output: 2
  
   Example 3:
   Input: s = "aabb"
   Output: -1
  
   Constraints:
   1 <= s.length <= 10^5
   s consists of only lowercase English letters.
 */

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int firstUniqChar(String s){
        Map <Character,Integer> lookup = new HashMap<>(); 
        
        // lookup table to track each char's frequency
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i); 
            lookup.put(c, lookup.getOrDefault(c, 0) + 1);
        }

        // finding outn first non repeating char from lookup and returning its index
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(lookup.get(ch) == 1) return i; 
        }
        return -1;
    }
}