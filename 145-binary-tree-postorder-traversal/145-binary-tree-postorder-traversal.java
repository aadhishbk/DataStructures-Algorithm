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
    public List<Integer> postorderTraversal(TreeNode root) {
       /*  trivial solution
       if(root == null)return new ArrayList<>();
        
        List<Integer> list = new ArrayList<>();
        list.addAll(postorderTraversal(root.left));
        list.addAll(postorderTraversal(root.right));
        list.add(root.val);
        return list;
    }
    */
        
        //iterative approach
        //two stack method
        if(root == null)return new ArrayList<>();
        Stack<TreeNode> s1 = new Stack<>();
        Stack<TreeNode> s2 = new Stack<>();
        List<Integer> list = new ArrayList<>();
        s1.push(root);
        while(!s1.isEmpty()){
            TreeNode n =  s1.pop();
            s2.push(n);
            if(n.left!=null)s1.push(n.left);
            if(n.right!=null)s1.push(n.right);
        }
        while(!s2.isEmpty()){
            list.add(s2.pop().val);
        }
        return list;
        
    }
    //single stack method awaited...
        
}