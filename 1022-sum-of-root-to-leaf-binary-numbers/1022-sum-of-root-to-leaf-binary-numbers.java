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
    public static int total=0;
    public int sumRootToLeaf(TreeNode root) {
        total =0;
        helper(root,0);
        return total;
    }
    public static void helper(TreeNode root,int cur)
    {
        if(root!=null)
        {
            cur = (cur<<1)|root.val;
            if(root.left==null && root.right==null)
                total += cur;
            helper(root.left,cur);
            helper(root.right,cur);
        }
        
    }
}