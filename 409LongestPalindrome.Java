/**
 * Given a string which consists of lowercase or uppercase letters, find the length of the longest palindromes that can be built with those letters.
 * This is case sensitive, for example "Aa" is not considered a palindrome here.
 * Note:
 * Assume the length of given string will not exceed 1,010.
 */
 
/**
 * Author: Recho
 * Java 1.7
 * 使用Set统计出现次数为偶数的字符，单数次出现添加，双数次出现删除
 */
  
import java.util.*;
public class Solution {
    public int longestPalindrome(String s) {
        if(s.length() == 0) return 0;
        
        int count = 0;
        Set<Character> charSet = new HashSet<Character>();
        for(int i = 0; i < s.length(); i++){
            if(charSet.contains(Character.valueOf(s.charAt(i)))){
                charSet.remove(Character.valueOf(s.charAt(i)));
                count++;
            }else{
            charSet.add(Character.valueOf(s.charAt(i)));
            }
        }
        
        if(!charSet.isEmpty()) return count * 2 + 1;
        else return count * 2;
    }
}
