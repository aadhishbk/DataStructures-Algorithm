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
    public int maxDepth(TreeNode root) {
      /*  int count =0;
        Queue<TreeNode> q = new LinkedList<>();
        if(root == null)return count;
        q.offer(root);
        while(!q.isEmpty()){
            int size = q.size();
            count++;
            for(int i =0; i<size;i++){
                if(q.peek().left != null)q.offer(q.peek().left);
                if(q.peek().right != null)q.offer(q.peek().right);
                q.poll();
            }
        }
        return count;*/
        
        //recursive
        if(root == null) return 0;
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        
        return 1+Math.max(left,right);
    }
}