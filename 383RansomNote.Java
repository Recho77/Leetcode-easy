//Given an arbitrary ransom note string and another string containing letters from all the magazines, 
//write a function that will return true if the ransom note can be constructed from the magazines; otherwise, it will return false.
//Each letter in the magazine string can only be used once in your ransom note.
//Note:
//You may assume that both strings contain only lowercase letters.
//Example:
//canConstruct("a", "b") -> false
//canConstruct("aa", "ab") -> false
//canConstruct("aa", "aab") -> true

import java.util.*;

public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(magazine == null || ransomNote.length() > magazine.length()) return false;
        
        //for each letter in magazine, create a Map to store the letter as key and its appearence time as value
        Map<Character, Integer> letters = new HashMap<Character, Integer>();
        for(int i = 0; i < magazine.length(); i++){
            Character current = magazine.charAt(i);
            if(letters.containsKey(current)) letters.put(current, letters.get(current) + 1);
            else letters.put(current, 1);
        }
        
        boolean status = true;
        for(int i = 0; i < ransomNote.length(); i++){
            Character current = ransomNote.charAt(i);
            if(!letters.containsKey(current)) {
                status = false;
                break;
            }
            else{
                if(letters.get(current) == 0){
                     status = false;
                     break;
                }else{
                    letters.put(current, letters.get(current) - 1);
                }
            }
        }
        
        return status;
    }
}
