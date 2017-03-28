//Given a binary tree, find its maximum depth.
//The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

 //BFS algorithm
 //In this quiz, using LinkedList instead of ArrayDeque for Deque
 //Though ArrayDeque generally performs better than LinkedList,
 //LinkedList supports null elements, whereas ArrayDeque does not
 
public class Solution {
    public int maxDepth(TreeNode root) {
        int depth = 0;
        Deque <TreeNode> queue = new LinkedList<TreeNode>();
        TreeNode current;
        
        if(root == null) return 0;
        queue.offerLast(root);
        
        while(queue.size() > 0){
            int size = queue.size();
            for(int i = 0; i < size; i++){
                current = queue.pollFirst();
                if(current.left != null) queue.offerLast(current.left);
                if(current.right != null) queue.offerLast(current.right);
                }
            depth++;
            }
            return depth;
    }
}
