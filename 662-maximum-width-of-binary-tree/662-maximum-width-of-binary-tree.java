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
    public int widthOfBinaryTree(TreeNode root) {
        if(root==null)
            return 0;
        Queue<TreeNode> q = new LinkedList<>();
        root.val = 1;
        q.offer(root);
        int min, max, ans=0, rem=0;
        while(!q.isEmpty()){
            int size = q.size();
            min = Integer.MAX_VALUE; max = Integer.MIN_VALUE;
            while(size-->0){
                TreeNode node = q.remove();
                min = Math.min(min, node.val);
                max = Math.max(max, node.val);
                if(node.left!=null){
                    node.left.val = (node.val-rem)*2+1;
                    q.offer(node.left);
                }
                if(node.right!=null){
                    node.right.val = (node.val-rem)*2+2;
                    q.offer(node.right);
                }
            }
            ans = Math.max(ans,max - min + 1);
            rem = min;
        }
        return ans;
    }
}