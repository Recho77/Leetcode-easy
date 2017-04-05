/**
 * Given a string and an integer k, you need to reverse the first k characters for every 2k characters counting from the start of the string. 
 * If there are less than k characters left, reverse all of them. 
 * If there are less than 2k but greater than or equal to k characters, then reverse the first k characters and left the other as original.
 */
 
/**
 * Author: Recho
 * Java 1.7
 * StringBuilder截取子串，求逆，替换
 */
 
 public class Solution {
    public String reverseStr(String s, int k) {
        StringBuilder revS = new StringBuilder(s);
        if(k >= s.length()){
            revS.reverse();
        }else{
            for(int i = 0; i < s.length(); i += 2*k){
                if(i+k-1 < s.length()){
                   StringBuilder scope = new StringBuilder(revS.substring(i, i+k));
                   scope.reverse();
                   revS.replace(i, i+k, scope.toString());
                }else{
                    StringBuilder scope = new StringBuilder(revS.substring(i));
                    scope.reverse();
                    revS.replace(i, s.length(), scope.toString());
                }
            }
        }
        
        return revS.toString();
    }
}
 
