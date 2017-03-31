//Given a non-empty integer array of size n,
//find the minimum number of moves required to make all array elements equal, where a move is incrementing n - 1 elements by 1.

public class Solution {
    public int minMoves(int[] nums) {
        if(nums.length < 2) return 0;
        
        int step = 0;
        Arrays.sort(nums);
        
        for(int i = nums.length - 1; i > 0; i--){
            int diff = nums[i] - nums[0];
            step += diff;
        }

        return step;
        
    }
}
