//Given a binary array, find the maximum number of consecutive 1s in this array.
//Input: [1,1,0,1,1,1]
//Output: 3
//Explanation: The first two digits or the last three digits are consecutive 1s.
//    The maximum number of consecutive 1s is 3.

public class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int start = 0;
        int len = 0;
        //remark whether recount the 1s number
        boolean status = true;
        
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1 && status == true) {
                start = i;
                status = false;
            }
            else if(nums[i] == 0 && status == false){
                len = Math.max(len, i - start);
                status = true;
            }
        }
        
        if(status == false)  len = Math.max(len, nums.length - start);
        
        return len;
    }
}
