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
    public TreeNode invertTree(TreeNode root) {
         if(root == null)return null;
        List<TreeNode> list = traverse(root);
        
        for(TreeNode n : list){
            TreeNode temp = n.left;
            n.left = n.right;
            n.right = temp;
        }
        return list.get(0);
       
        
    }
    public List<TreeNode> traverse(TreeNode root){
        if(root == null)return new ArrayList<>();
        
        List<TreeNode> list = new ArrayList<>();
        list.add(root);
        list.addAll(traverse(root.left));
        list.addAll(traverse(root.right));

        return list;
        
    }
}