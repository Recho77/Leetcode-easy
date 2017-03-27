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
 

public class Solution {
    public int maxDepth(TreeNode root) {
       //BFS algorithm
       if (root == null) return 0;
        
	    Deque<TreeNode> stack = new LinkedList<TreeNode>();
	
	    stack.push(root);
	    int count = 0;
	
	    while (!stack.isEmpty()) {
		    int size = stack.size();
	    	while (size-- > 0) {
			    TreeNode cur = stack.pop();
			    if (cur.left != null)
				    stack.addLast(cur.left);
			    if (cur.right != null)
				    stack.addLast(cur.right);
	    	}
		    count++;

	    }
	return count;
    }
}
