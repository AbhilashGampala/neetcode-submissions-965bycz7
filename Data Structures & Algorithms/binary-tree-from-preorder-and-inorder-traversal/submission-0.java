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
    HashMap<Integer,Integer> map=new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        return buildtree(inorder,0,inorder.length-1,preorder,0,preorder.length-1);
    }
    public TreeNode buildtree(int[] in,int ins,int ine,int[] pre,int pres,int pree){
        if(ine<ins||pree<pres) return null;
        TreeNode root=new TreeNode(pre[pres]);
        int r=map.get(pre[pres]);
        root.left=buildtree(in,ins,r-1,pre,pres+1,pres+r-ins);
        root.right=buildtree(in,r+1,in.length,pre,pres+r-ins+1,pree);
        return root;
    }
}
