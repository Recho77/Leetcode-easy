//Given an array of integers, every element appears twice except for one. Find that single one.
//Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

public class Solution {
    public int singleNumber(int[] nums) {
        //using XOR to find the number appears only one time 
        //note that a XOR a = 0, a XOR 0 = a
        
        int result = 0;
        
        for(int i = 0; i < nums.length; i++){
            result = result ^ nums[i];
        }
        
        return result;
    }
}
