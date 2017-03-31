/**
 * Find the sum of all left leaves in a given binary tree.
 * Example:
 *    3
 *   / \
 *  9  20
 *    /  \
 *   15   7
 * There are two left leaves in the binary tree, with values 9 and 15 respectively. Return 24.
 */
 

import java.util.*;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        if(root == null) return 0;
        
        int sum = 0;
        Deque<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offerLast(root);
        
        while(!queue.isEmpty()){
            TreeNode current = queue.pollFirst();
            if(current.left != null){
                if(current.left.left == null && current.left.right == null) sum += current.left.val;
                else queue.offerLast(current.left);
            }
            if(current.right != null) queue.offerLast(current.right);
        }
        
        return sum;
    }
}
