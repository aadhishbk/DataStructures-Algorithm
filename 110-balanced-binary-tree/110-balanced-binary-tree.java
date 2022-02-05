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
    public boolean isBalanced(TreeNode root) 
     /*
     public boolean isBalanced(TreeNode root)
     {
        if(root == null)return true;
        
        int lht = height(root.left);
        int rht = height(root.right);
        
        if(lht >rht){
            if((lht-rht)>1)return false;       
        }
        else if((rht - lht)>1)return false;
            
        
        boolean left = isBalanced(root.left);
        boolean right = isBalanced(root.right);
        
        if(left && right) return true;
        else return false;
    }
    public int height(TreeNode node){
        if(node == null)return 0;
        
        int lht = height(node.left);
        int rht = height(node.right);
        
        return 1 + Math.max(lht,rht);
    }
    */
        
        //optimized sol starts
    {
        return height(root) == -1 ? false : true;
    }   
    
     public int height(TreeNode node){
         if(node == null) return 0;
         
         int lht = height(node.left);
         if(lht == -1 ) return -1;
         int rht = height(node.right);
         if(rht == -1 ) return -1;
         
         if(Math.abs(lht - rht)>1) return -1;
         else return  1+Math.max(lht,rht);
     }
    
}