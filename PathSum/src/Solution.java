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
    public static boolean hasPathSum(TreeNode root, int sum) {
        if(root == null){
        	return false;
        }
        
        if(root.left == null && root.right == null){
        	return root.val == sum;
        }
        
    	if(hasPathSum(root.left, sum - root.val)) return true;
    	
    	return hasPathSum(root.right, sum - root.val);
    	
    }
    
    public static void main(String[] args){
    	TreeNode tn = new TreeNode(5);
    	tn.left = new TreeNode(4);
    	tn.right = new TreeNode(8);
    	tn.left.left = new TreeNode(11);
    	tn.left.left.left = new TreeNode(7);
    	tn.left.left.right = new TreeNode(2);
    	tn.right.left = new TreeNode(13);
    	tn.right.right = new TreeNode(4);
    	tn.right.right.right = new TreeNode(1);
    	System.out.println(hasPathSum(tn, 22));
    	
    }
}