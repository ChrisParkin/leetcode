/**
 * Definition for binary tree
 **/
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
 
public class Solution {
    public int minDepth(TreeNode root) {
        // node is null
        if(root == null){
            return 0;
        }
        
        // has both children
        if(root.left != null && root.right != null){
            return 1 + Math.min(minDepth(root.left), minDepth(root.right));
        }
        
        // has left child
        if(root.left != null) return 1 + minDepth(root.left);
        
        // has right child
        if(root.right != null) return 1 + minDepth(root.right);
        
        // no children
        return 1;
        
    }
}