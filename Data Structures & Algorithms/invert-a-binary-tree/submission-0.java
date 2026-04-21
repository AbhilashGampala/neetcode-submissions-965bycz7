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
    public TreeNode rec(TreeNode node){
        if(node==null){
            return node;
        }
        TreeNode temp=node.left;
        node.left=rec(node.right);
        node.right=rec(temp);

        return node;
    }
    public TreeNode invertTree(TreeNode root) {
        rec(root);
        return root;
    }
}
