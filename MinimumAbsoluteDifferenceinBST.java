/**
 * given a binary search tree with non-negative values, find the minimum absolute difference between values of any two nodes.
 * Example:
 * Input:
 *   1
 *    \
 *     3
 *    /
 *   2
 * Output:
 * 1
 * Explanation:
 * The minimum absolute difference is 1, which is the difference between 2 and 1 (or between 2 and 3).
 * Note: There are at least two nodes in this BST.
 *
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
 
public class Solution {
    private int minDif = Integer.MAX_VALUE;
    private TreeNode prev;
   
   //return method     
    public int getMinimumDifference(TreeNode root) {
        if(root != null)  traverse(root);
        return minDif;
  
    }
    
    //Inorder traverse,compare two continuous node
    private void traverse(TreeNode current){
        if(current != null){
             traverse(current.left);
        
            //process of current node
            if(prev != null){
                minDif = Math.min(minDif, current.val - prev.val);
             }
            prev = current;
        
            traverse(current.right);
        }
    }
}
