/**
 * Given two strings s and t, write a function to determine if t is an anagram of s.
 * For example,
 * s = "anagram", t = "nagaram", return true.
 * s = "rat", t = "car", return false.
 * Note:
 * You may assume the string contains only lowercase alphabets.
 */
 
/**
 * Author: Recho
 * Java 1.7
 * 对两数组进行排序，比较排序后每个字符是否相同
 */
 
 public class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        else{
            int length = s.length();
            char[] charS = s.toCharArray();
            char[] charT = t.toCharArray();
            Arrays.sort(charS);
            Arrays.sort(charT);
            for(int i = 0; i < length; i++){
                if(charS[i] != charT[i]) return false;
            }
            return true;
        }
    }
}
