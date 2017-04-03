/**
 * Given two binary trees, write a function to check if they are equal or not.
 * Two binary trees are considered equal if they are structurally identical and the nodes have the same value.
 */
 
/**
 * Author：Recho
 * Java 1.7
 * 递归法比较
 */
 public class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        boolean check = true;
        if((p != null && q == null) || (p ==null && q != null))  check = false;
        else if(p != null && q != null){
            check = isSameTree(p.left, q.left);
            if(!check) return false;
            else{
                if(p.val != q.val) return false;
            }
            check = isSameTree(p.right, q.right);
            if(!check) return false;
        }
        return check;
    }
}


/**
 * better solution
 */
 public boolean isSameTree(TreeNode p, TreeNode q) {
    if(p == null && q == null) return true;
    if(p == null || q == null) return false;
    if(p.val == q.val)
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    return false;
}
