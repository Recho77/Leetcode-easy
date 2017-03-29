//Given scores of N athletes, find their relative ranks and the people with the top three highest scores, who will be awarded medals: "Gold Medal", "Silver Medal" and "Bronze Medal".
//Note:
//N is a positive integer and won't exceed 10,000.
//All the scores of athletes are guaranteed to be unique.

public class Solution {
    public String[] findRelativeRanks(int[] nums) {
        
        int length = nums.length;
        if(length == 0) return null;
        
        //sort the initial array as their rank
        int[] sortedNums = new int[length];
        for(int i = 0; i < length; i++) sortedNums[i] = nums[i];
        Arrays.sort(sortedNums);
        
        //build a Map to store the relationship between value and rank
        Map<Integer, String> relation = new HashMap<Integer, String>();
        
        for(int i = length-1; i >= 0; i--){
            if (i == length-1) relation.put(new Integer(sortedNums[length-1]), "Gold Medal");
            else if (i == length-2) relation.put(new Integer(sortedNums[length-2]), "Silver Medal");
            else if (i == length-3) relation.put(new Integer(sortedNums[length-3]), "Bronze Medal");
            else relation.put(new Integer(sortedNums[i]), String.valueOf((length-i)));
        }
        
        String[] result = new String[length];
        for(int i = 0; i < length; i++){
            result[i] = relation.get(nums[i]);
        }
        
        return result;
    }
}
