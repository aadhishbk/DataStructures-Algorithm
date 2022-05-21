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
        List<List<Integer>> retlist = new ArrayList<>();
        boolean ltor = true;
        
        if(root ==null){
            return retlist;
        }
        q.offer(root);
        while(!q.isEmpty()){
            int size = q.size();
            Integer[] arr = new Integer[size];
            List<Integer> list = new ArrayList<>();
            for(int i=0; i<size;i++){
                TreeNode n = q.peek();
                if(n.left != null)q.offer(n.left);
                if(n.right !=null)q.offer(n.right);
                int index = ltor ? i : size -i -1;
                arr[index]= q.poll().val;
            }
            ltor = !ltor;
            retlist.add(Arrays.asList(arr));
        }
        return retlist;
    }
}