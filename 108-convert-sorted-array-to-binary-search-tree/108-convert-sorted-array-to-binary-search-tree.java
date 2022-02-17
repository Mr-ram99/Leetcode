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
    public TreeNode sortedArrayToBST(int[] nums) {
        int n=nums.length;
        if(n==1)
            return new TreeNode(nums[0]);
        int s=0, e=n-1, mid= s+(e-s)/2;
        TreeNode root = new TreeNode();
        root = bst(s,e,nums);
        return root;
    }
    public static TreeNode bst(int s, int e,int[] nums){
        if(s>e)
            return null;
        int mid = s + (e-s)/2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = bst(s,mid-1,nums);
        node.right = bst(mid+1,e,nums);
        return node;
    }
}