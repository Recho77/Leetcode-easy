/**
 * Given an integer, return its base 7 string representation.
 * Example 1:
 *  Input: 100
 *  Output: "202"
 * Example 2:
 *  Input: -7
 *  Output: "-10"
 * Note: The input will be in range of [-1e7, 1e7]
 */
 
 /**
  * Author: Recho
  * Java 1.7
  * 使用绝对值求num的7进制表示的逆序，若num为负值，则最后添加"-"
  */
  
  public class Solution {
    public String convertToBase7(int num) {
        if(num == 0)  return "0";
        
        int abs = Math.abs(num);
        StringBuilder base7 = new StringBuilder();
        
        while(abs != 0){
            base7.append(abs % 7);
            abs /= 7;
        }
        if(num < 0)
            base7.append("-");
            
        return base7.reverse().toString();
    }
}
