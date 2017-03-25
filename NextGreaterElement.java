//You are given two arrays (without duplicates) nums1 and nums2 where nums1’s elements are subset of nums2. 
//Find all the next greater numbers for nums1's elements in the corresponding places of nums2.
//The Next Greater Number of a number x in nums1 is the first greater number to its right in nums2. 
//If it does not exist, output -1 for this number.

import java.util.*;

public class Solution {
    public int[] nextGreaterElement(int[] findNums, int[] nums) {
        //define a Map to store the next number
        Map<Integer, Integer> nextMap = new HashMap<Integer, Integer>();
        
        //define an array of integers as the result
        int[] result = new int[findNums.length];
        
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                if(nums[j] > nums[i]){
                    nextMap.put(nums[i], nums[j]);
                    break;
                }
            }
            if(!(nextMap.containsKey(nums[i]))) nextMap.put(nums[i], -1);
        }
        
        for(int i = 0; i < findNums.length; i++){
            result[i] = nextMap.get(findNums[i]);
        }
        
        return result;
     }
    }
