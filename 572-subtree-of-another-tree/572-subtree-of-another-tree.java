/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root==null)
            return false;
        if(isSame(root,subRoot))
            return true;
        return isSubtree(root.right,subRoot) || isSubtree(root.left,subRoot);
    }
    public static boolean isSame(TreeNode r, TreeNode s){
        if(s==null && r==null)
            return true;
        if(s==null || r==null)
            return false;
        if(s.val != r.val) return false;
        return isSame(r.right, s.right) && isSame(r.left, s.left);
    }
     
}