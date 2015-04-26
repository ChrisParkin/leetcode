/**
 * Definition for binary tree
 */
 class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
 }
 
public class Solution {
    
	public static int sumNumbers(TreeNode root) {
       if(root == null) return 0;
       return sumNumbers(root, 0);

    }
	
	public static int sumNumbers(TreeNode root, int sum){
		if(root == null) return sum;
		
		TreeNode left = root.left;
		TreeNode right = root.right;
		
		int nodeSum = 10*sum + root.val;
		
		if(left == null && right == null){
			return sum*10 + root.val;
		}
		
		
		if(left != null && right == null){
			return sumNumbers(left, sum*10+root.val);
		}
		
		if(left == null && right != null){
			return sumNumbers(right, sum*10+root.val);
		}
		
		if(left != null && right != null){
			return sumNumbers(left, sum*10+root.val) + sumNumbers(right, sum*10+root.val);
		}
		return sum;
	}
	
    public static void main(String[] args){
    	TreeNode tn = new TreeNode(1);
    	tn.left = new TreeNode(2);
    	tn.left.left = new TreeNode(4);
    	tn.left.right = new TreeNode(5);
    	tn.right = new TreeNode(6);
    	
    	System.out.println(sumNumbers(tn));
    }
    
    
}