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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> list = new ArrayList<>();
        Stack<Integer> stk = new Stack<>();
        if(root==null)
            return list;
        q.offer(root);
        boolean flag = true;
        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> li = new ArrayList<>();
            while(size-->0){
                TreeNode node = q.remove();
                if(flag)
                    li.add(node.val);
                else
                    stk.add(node.val);
                if(node.left!=null)
                    q.offer(node.left);
                if(node.right!=null)
                    q.offer(node.right);
            }
            if(!flag)
            {
                while(!stk.isEmpty())
                    li.add(stk.pop());
            }
            list.add(li);
            flag = !flag;
        }
        return list;
    }
}