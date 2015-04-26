import java.util.ArrayList;
import java.util.List;

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
    public static List<List<Integer>> levelOrder(TreeNode root) {
        
        List<List<Integer>> result = new ArrayList<>();
        if(root == null) return result;
        
        List<TreeNode> needsVisit = new ArrayList<>(1);
        needsVisit.add(root);
        
        List<TreeNode> tmp;
        ArrayList<Integer> values;
        int level = 1;
        
        while(needsVisit.size() > 0){
            
            values = new ArrayList<Integer>(needsVisit.size());
            tmp = new ArrayList<TreeNode>();
            for(TreeNode t : needsVisit){
                values.add(t.val);
                if(t.left != null) tmp.add(t.left);
                if(t.right != null) tmp.add(t.right);
            }
            
            result.add(values);
            needsVisit = tmp;
        }
        return result;
    }
    
    public static void main(String[] args){
//    	TreeNode root = new TreeNode(50);
//    	
//    	root.left = new TreeNode(30);
//    	root.left.left = new TreeNode(20);
//    	root.left.right = new TreeNode(40);
//    	root.left.right.left = new TreeNode(35);
//    	
//    	root.right = new TreeNode(70);
//    	root.right.left = new TreeNode(60);
//    	root.right.left.right = new TreeNode(65);
//    	root.right.right = new TreeNode(80);
    	
    	TreeNode root = new TreeNode(-150);
    	TreeNode pointer = root;
    	for(int i = -149; i < 0; i++){
        	pointer.left = new TreeNode(i);
        	pointer = pointer.left;
    	}
    	
    	List<List<Integer>> result = levelOrder(root);
    	for(List<Integer> l : result){
    		System.out.println(l.toString());
    	}
    	
    }
}