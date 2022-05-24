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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        
        TreeNode insert = new TreeNode(val);
        if(root == null)return insert;
        TreeNode prev = root;
        TreeNode ret = root;
        while(root != null)
        {
            prev = root;
            if(root.val > val)root = root.left;
            else root = root.right;
            
        }
        if(val > prev.val) prev.right = insert;
        else prev.left = insert;
        
        return ret;
    }
}