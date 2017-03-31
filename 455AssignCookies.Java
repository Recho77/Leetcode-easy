//Assume you are an awesome parent and want to give your children some cookies. But, you should give each child at most one cookie. 
//Each child i has a greed factor gi, which is the minimum size of a cookie that the child will be content with; 
//and each cookie j has a size sj. If sj >= gi, we can assign the cookie j to the child i, and the child i will be content. 
//Your goal is to maximize the number of your content children and output the maximum number.
//Note:
//You may assume the greed factor is always positive. 
//You cannot assign more than one cookie to one child.

public class Solution {
    public int findContentChildren(int[] g, int[] s) {
        //sort two arrays in ascending order
        Arrays.sort(s);
        Arrays.sort(g);
        
        int count = 0;
        
        for(int i = s.length - 1; i >= 0; i--){
            for(int j = g.length - 1; j >= 0; j--){
                if(s[i] >= g[j]) {
                    count++;
                    g[j] = Integer.MAX_VALUE; 
                    break;
                }
            }
        }
        
        return count;
    }
}
