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
    PriorityQueue<Integer> p=new PriorityQueue<>();
    public void fill(TreeNode root){
        if(root==null) return;
        p.add(root.val);
        fill(root.left);
        fill(root.right);
    }
    public int kthSmallest(TreeNode root, int k) {
        fill(root);
        int ans=0;
        for(int i=0;i<k;i++){
            ans=p.poll();
        }
        return ans;
    }
}
