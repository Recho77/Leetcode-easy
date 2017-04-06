/**
 * Given n points in the plane that are all pairwise distinct, a "boomerang" is a tuple of points (i, j, k) such that the distance between i and j equals the distance between i and k (the order of the tuple matters).
 * Find the number of boomerangs. You may assume that n will be at most 500 and coordinates of points are all in the range [-10000, 10000] (inclusive).
 */
 
/**
 * 参考大神code
 * Java 1.8  --- Map.getOrDefault()
 * 用一个HashMap存i到其他各点距离的出现次数，由于(i,j,k)顺序不同被视为不同情况，那么如果一种距离出现n次，其对应的可能情况有A2n（n*(n-1)）种。
 * 返回结果为所有距离的可能情况数求和。
 */
 
import java.util.*;

public class Solution {
    public int numberOfBoomerangs(int[][] points) {
        int result = 0;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        for(int i = 0; i < points.length; i++){
            for(int j = 0; j < points.length; j++){
                if(i == j) continue;
                else{
                    int d = getDistance(points[i], points[j]);
                    map.put(d, map.getOrDefault(d, 0) + 1);
                }
            }
            
             for(Integer value : map.values()){
                result += value * (value - 1);
             }
             
             map.clear();
        }

        
        return result;
    }
    
    public int getDistance(int[] i, int[] j){
        int x = i[0] - j[0];
        int y = i[1] - j[1];
        return x*x + y*y;
    }
}
