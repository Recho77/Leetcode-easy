//Given a positive integer, output its complement number. The complement strategy is to flip the bits of its binary representation.
//Note:
//The given integer is guaranteed to fit within the range of a 32-bit signed integer.
//You could assume no leading zero bit in the integer’s binary representation.

public class Solution {
    public int findComplement(int num) {
        
        String binaryNum = Integer.toBinaryString(num);
        int len = binaryNum.length();
        
        StringBuffer padding = new StringBuffer();
        while(padding.length() < len) padding.append('1');
        int intPadding = Integer.valueOf(padding.toString(), 2);
        
        int complement = num ^ intPadding;
        
        return complement;
    }
}
