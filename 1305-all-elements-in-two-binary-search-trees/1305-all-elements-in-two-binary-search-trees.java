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
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        getnode(root1,list1);
        getnode(root2,list2);
        int i=0,j=0;
        while(i<list1.size() && j<list2.size())
        {
            if(list1.get(i)<list2.get(j))
            {
                ans.add(list1.get(i));
                i++;
            }
            else
            {
                ans.add(list2.get(j));
                j++;
            }
        }
        while(i<list1.size())
        {
            ans.add(list1.get(i));
            i++;
        }
        while(j<list2.size())
        {
            ans.add(list2.get(j));
            j++;
        }
        return ans;
    }
    public static void getnode(TreeNode root, List<Integer> li)
    {
        if(root == null)
            return ;
        getnode(root.left,li);
        li.add(root.val);
        getnode(root.right,li);
    }
}