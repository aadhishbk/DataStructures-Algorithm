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
    public List<Integer> preorderTraversal(TreeNode root) {
       /* trivial solution
        if(root == null)return new ArrayList<>();
        
        List<Integer> list = new ArrayList<>();
        list.add(root.val);
        list.addAll(preorderTraversal(root.left));
        list.addAll(preorderTraversal(root.right));
        return list;
        */
        
        //iterative approach
        if(root == null)return new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> st = new Stack<>();
        st.push(root);
        while(!st.isEmpty()){
            TreeNode n = st.pop();
            list.add(n.val);
            if(n.right !=null)st.push(n.right);
            if(n.left != null)st.push(n.left);
        }
        return list;
    }
}