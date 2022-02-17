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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> li = new ArrayList<>();
        if(root == null)
            return list;
        li.add(root.val);
        allpaths(root, targetSum, root.val, list, li);
        return list;
    }
    public static void allpaths(TreeNode root,int target, int sum, List<List<Integer>> list, List<Integer> li){
        if(root.left == null && root.right == null)
        {
            if(sum == target)
            {
                list.add(new ArrayList<>(li));
            }
            return;
        }
        
        if(root.left!=null){
            sum += root.left.val;
            li.add(root.left.val);
            allpaths(root.left, target, sum, list, li);
            sum -= root.left.val;
            li.remove(li.size()-1);
        }
        if(root.right!=null){
            sum += root.right.val;
            li.add(root.right.val);
            allpaths(root.right, target, sum, list, li);
            sum -= root.right.val;
            li.remove(li.size()-1);
        }
    }
}