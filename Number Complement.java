//Given a positive integer, output its complement number. The complement strategy is to flip the bits of its binary representation.
//Note:
//The given integer is guaranteed to fit within the range of a 32-bit signed integer.
//You could assume no leading zero bit in the integer’s binary representation.

public class Solution {
    public int findComplement(int num) {
        //与num位数相等的全1填充
        int intPadding  = (Integer.highestOneBit(num) << 1 ) - 1;
        int complement = num ^ intPadding;
        
        return complement;
    }
}
