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
    public int diameterOfBinaryTree(TreeNode root) {
        int max =0;
        if(root == null)return max;
        
        int lh = ht(root.left);
        int rh = ht(root.right);
        
        max = Math.max(max,lh+rh);
        
       int leftht =  diameterOfBinaryTree(root.left);
       int rightht =  diameterOfBinaryTree(root.right);
        
        int maxmht = Math.max(leftht,rightht);
        
        return Math.max(max,maxmht);
        
        
    }
    public int ht(TreeNode root){
        if(root == null)return 0;
        
        int lh = ht(root.left);
        int rh = ht(root.right);
        
        return 1+Math.max(lh,rh);
    }
}