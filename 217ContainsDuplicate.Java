/**
 * Given an array of integers, find if the array contains any duplicates. 
 * Your function should return true if any value appears at least twice in the array, 
 * and it should return false if every element is distinct.
 */
 
/**
 * Author: Recho
 * Java 1.7
 * Set的add()方法能很好解决这一问题。当set中已经存在相同元素时，add()方法返回false
 */
 
import java.util.*;

public class Solution {
    public boolean containsDuplicate(int[] nums) {
        if(nums.length < 2) return false;
        
        Set<Integer> numsCount = new HashSet<Integer>();
        for(int i : nums){
            if(!numsCount.add(i)) return true;
        }
        
        return false;
    }
}
