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
    public boolean isCousins(TreeNode root, int x, int y) {
        int x_par = -1;
        int y_par = -1;
        int x_pos=-1;
        int y_pos=-1;
        if (root == null)
            return list;
        helper(root,0,x,y);
        return list;
    }

    private void helper(TreeNode root,int lvl,int x,int y){
        if(root==null){
            return;
        }

       if(x.left!=null)
       {
            if(root.left==x){
            x_par=root.val;
            x_pos=lvl+1;
        }
        else if(root.right==y){
            y_par=root.val;
            y_pos=lvl+1
        }
        helper(root.left,lvl+1,x,y);
        }

        if(x.right!=null)
        { 
           if(root.left==x){
            x_par=root.val;
            x_pos=lvl+1;
        }
        else if(root.right==y){
            y_par=root.val;
            y_pos=lvl+1
        }
        helper(root.left,lvl+1,x,y);
        }

       
    }
}