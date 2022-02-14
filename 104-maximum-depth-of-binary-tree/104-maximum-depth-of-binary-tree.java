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
    public int maxDepth(TreeNode root) {
        if(root == null)
            return 0;
        return maxheight(root);
    }
    public static int maxheight(TreeNode root){
        if(root.left == null && root.right == null)
            return 1;
        int lh=0, rh=0;
        if(root.left!=null)
            lh = maxheight(root.left);
        
        if(root.right!=null)
            rh = maxheight(root.right);
        return 1 + Math.max(lh, rh);
    }
}