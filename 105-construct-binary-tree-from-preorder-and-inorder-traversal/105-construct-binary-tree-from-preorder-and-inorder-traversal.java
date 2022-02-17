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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = preorder.length;
        for(int i=0;i<n;i++){
            map.put(inorder[i],i);
        }
        TreeNode root = buildtree(preorder, 0,n-1, inorder, 0, n-1, map);
        return root;
    }
    public static TreeNode buildtree(int [] preorder,int preStart,int preEnd, int[] inorder, int inStart, int inEnd, HashMap<Integer, Integer> map){
        if(preStart>preEnd || inStart>inEnd){
            return null;
        }
        TreeNode root = new TreeNode(preorder[preStart]);
        int inRoot = map.get(root.val);
        int numsleft = inRoot - inStart;
        root.left = buildtree(preorder, preStart+1,preStart+numsleft, inorder, inStart, inRoot-1, map);
        root.right = buildtree(preorder, preStart+numsleft+1,preEnd, inorder, inRoot+1, preEnd, map);
        return root;
    }
}