//Calculate the sum of two integers a and b, but you are not allowed to use the operator + and -.

//+ operation : XOR operation with carry
//carry can be implemented by & opertion then left shift 1 bit

public class Solution {
    public int getSum(int a, int b) {
        int result = a ^ b; 
        int carry = a & b;
        
        while(carry != 0){
            int result_old = result;
            carry = carry << 1;
            result = result ^ carry;
            carry = result_old & carry;
        }
        
        return result;
    }
}
