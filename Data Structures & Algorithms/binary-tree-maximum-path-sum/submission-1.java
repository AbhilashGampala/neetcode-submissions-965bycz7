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
    int max=Integer.MIN_VALUE;
    public int help(TreeNode root){
        if(root==null) return 0;
        int left=Math.max(0,help(root.left));
        int right=Math.max(0,help(root.right));
        int cur=left+right+root.val;
        max= Math.max(max,cur);
        return root.val+Math.max(left,right);
    }
    public int maxPathSum(TreeNode root) {
        // int max=Integer.MIN_VAlUE;
        help(root);
        return max;
    }
}
