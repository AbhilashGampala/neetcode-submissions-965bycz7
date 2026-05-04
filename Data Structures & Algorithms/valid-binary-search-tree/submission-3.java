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
    public boolean isV(TreeNode root,int left,int right){
        if(root==null)return true;
        if(root.val>=right||root.val<=left)return false;
        return isV(root.left,left,root.val)&&isV(root.right,root.val,right);
    }
    public boolean isValidBST(TreeNode root) {
        return isV(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }
}
