//Given an array of integers where 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.
//Find all the elements of [1, n] inclusive that do not appear in this array.
//Could you do it without extra space and in O(n) runtime? You may assume the returned list does not count as extra space.

public class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> disappeared = new ArrayList<Integer>();
        
        //relate the array content with array index
        for(int i = 0 ; i < nums.length; i++){
            int var = Math.abs(nums[i]) - 1;
            if (nums[var] > 0) nums[var] = - (nums[var]);
        } 
        
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > 0) disappeared.add(i+1);
        }
        
        return disappeared;
    }
  }
