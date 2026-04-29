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
    public boolean isBalanced(TreeNode root) {
        int height = height(root);
        return height !=-1;
    }
    public int height(TreeNode root){
        if(root  == null) return  0;
        int leftsubtree =  height(root.left);
        int rightsubtree =  height(root.right);
        if(leftsubtree ==-1 || rightsubtree ==-1){
            return -1;
        }
        if(Math.abs(leftsubtree - rightsubtree)>1){
            return -1;
        }
        return 1+Math.max(leftsubtree,rightsubtree);
    }
}