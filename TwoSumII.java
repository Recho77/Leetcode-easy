//Given an array of integers that is already sorted in ascending order, find two numbers such that they add up to a specific target number.
//The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.
//You may assume that each input would have exactly one solution and you may not use the same element twice.

import java.util.*;

public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        if(numbers.length < 2) return null;
        
        Set<Integer> set = new HashSet<Integer>();
        int start = 0;
        int another = 0;
        int[] result = new int[2];
        
        for(int i = 0; i < numbers.length; i++){
            set.add(new Integer(numbers[i]));
        }
        
        for(int i = 0; i < numbers.length; i++){
            another = target - numbers[i];
            if(set.contains(another)){
                start = i;
                result[0] = i + 1;
                break;
            }
        }
        
        for(int i = start + 1; i < numbers.length; i++){
            if(numbers[i] == another){
                result[1] = i + 1;
                break;
            }
        }
        
        return result;
    }
}
