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
    public List<Integer> inorderTraversal(TreeNode root) {
       /* 
       recursive soln is trivial
       if(root == null)return new ArrayList<>();
        
        List<Integer> list = new ArrayList<>();
        list.addAll(inorderTraversal(root.left));
        list.add(root.val);
        list.addAll(inorderTraversal(root.right));

        return list;
        */
        
        //iterative approach
        
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> st = new Stack<>();
        while(true){
            if(root != null){
                st.push(root);
                root = root.left;
            }else{
                if(st.isEmpty())break;
                root = st.pop();
                list.add(root.val);
                root = root.right;
            }
        }
        return list;
    }
}