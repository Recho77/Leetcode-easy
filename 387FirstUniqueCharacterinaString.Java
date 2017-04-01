//Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.
//Examples:
//s = "leetcode"
//return 0.
//s = "loveleetcode",
//return 2.
//Note: You may assume the string contain only lowercase letters.

import java.util.*;

public class Solution {
    public int firstUniqChar(String s) {
        Map<Character, Integer> countChar = new HashMap<Character, Integer>();
        for(int i = 0; i < s.length(); i++){
            char current = s.charAt(i);
            if(countChar.containsKey(current)) countChar.put(current, countChar.get(current) + 1);
            else countChar.put(current, 1);
        }
        
        for(int i = 0; i < s.length(); i++){
            char current = s.charAt(i);
            if(countChar.get(current) == 1){
                return i;
            }
        }
        
        return -1;
        
    }
}
