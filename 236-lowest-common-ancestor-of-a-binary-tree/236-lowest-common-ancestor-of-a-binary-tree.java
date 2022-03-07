/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        ArrayList<TreeNode> list1 = new ArrayList<>();
        ArrayList<TreeNode> list2 = new ArrayList<>();
        path(root, p, list1);
        path(root, q, list2);
        int i=0;
        while(i<list1.size() && i<list2.size() && list1.get(i)==list2.get(i)){
            i++;
        }
        return list1.get(i-1);
    }
    public static boolean path(TreeNode root, TreeNode t, ArrayList<TreeNode> list){
        if(root==null)
            return false;
        list.add(root);
        if(root == t)
            return true;
        if(path(root.left,t,list) || path(root.right,t,list))
            return true;
        list.remove(list.size()-1);
        return false;
    }
}