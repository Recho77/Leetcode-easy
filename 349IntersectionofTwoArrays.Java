//Given two arrays, write a function to compute their intersection.
//Example:
//Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2].
//Note:
//Each element in the result must be unique.
//The result can be in any order.

public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int[] result = new int[0];
        
       if(nums1.length == 0 || nums2.length == 0) return result;
       
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        if(nums1[0] > nums2[nums2.length-1] || nums2[0] > nums1[nums1.length-1]) return result;
        
        Set<Integer> resultSet = new HashSet<Integer>();
        int i = 0, j =0;
        
        while(i < nums1.length && j < nums2.length){
            if(nums1[i] < nums2[j]) i++;
            else if(nums1[i] > nums2[j]) j++;
            else {
                resultSet.add(nums1[i]);
                i++;
                j++;
             }
        }
        
        result = new int[resultSet.size()];
        i = 0;
        for(Integer o : resultSet){
            result[i] = o.intValue();
            i++;
        }
            
        return result;
    }
}
