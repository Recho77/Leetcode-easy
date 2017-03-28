/**
*Invert a binary tree.
*
*      4
*     /   \
*    2     7
*   / \   / \
*  1   3 6   9
*
*    to
*       4
*     /   \
*    7     2
*   / \   / \
*  9   6 3   1
*
* Definition for a binary tree node.
* public class TreeNode {
*     int val;
*     TreeNode left;
*     TreeNode right;
*     TreeNode(int x) { val = x; }
* }
*/

//Non-recursion BFS algorithm
 public class Solution {
    public TreeNode invertTree(TreeNode root) {
        //queue for traverse this tree
        Deque<TreeNode> queue = new LinkedList<TreeNode>();
        //current treenNode
        TreeNode current;
        
        if(root == null) return root;
        queue.offerLast(root);
        while(queue.size() > 0){
            current = queue.pollFirst();
            if(current.left != null) queue.offerLast(current.left);
            if(current.right != null) queue.offerLast(current.right);
            
            //exchange the position of left child and right child
            TreeNode temp = current.right;
            current.right = current.left;
            current.left = temp;
        }
        
        return root;
    }
}

 //Recursion DFS algorithm
 public class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root == null) return null;
        TreeNode tmp = root.left;
        root.left = invertTree(root.right);
        root.right = invertTree(tmp);
        return root;
    }
}
