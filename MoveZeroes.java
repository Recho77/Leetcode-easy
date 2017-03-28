//Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
//For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].
//Note:
//You must do this in-place without making a copy of the array.
//Minimize the total number of operations.

public class Solution {
    public void moveZeroes(int[] nums) {
        //count the number of zeros
        int count = 0;
        
        //non-zero elements overwrite the previous one in the correct position.
        //in the end of the array, fill in the corresponding number of zeros.
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0) count++;
            else{
                if(count > 0){
                    nums[i-count] = nums[i];
                }
            }
        }
        
        int index = nums.length-1;
        while(count > 0){
              nums[index] = 0;
              index --;
              count --;
        }
    }
}
