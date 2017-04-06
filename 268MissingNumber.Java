/**
 * Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.
 * For example,
 * Given nums = [0, 1, 3] return 2.
 * Note:
 * Your algorithm should run in linear runtime complexity. Could you implement it using only constant extra space complexity?
 */
 
/**
 * Author: Recho
 * Java 1.7
 * 计算n个数求和的预期值，及nums各元素求和的实际值，结果=预期值-实际值
 */
 
public class Solution {
    public int missingNumber(int[] nums) {
        int expect = 0;
        int real = 0;
        int n = nums.length;
        
        expect = n*(n+1)/2;
        for(int i = 0; i < nums.length; i++){
            real += nums[i];
        }
        
        return expect - real;
    }
}
