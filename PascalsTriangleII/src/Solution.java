import java.util.List;
import java.util.ArrayList;

public class Solution {
    public List<Integer> getRow(int rowIndex) {
    	
    	List<Integer> result = new ArrayList<Integer>();
    	long nCm = 1;
    	int n = rowIndex;
    	result.add(1);
    	for(int m=0; m < n; m++){
    		nCm = nCm * (n-m) / (m+1);
    		result.add((int)nCm);
    	}
    	return result;
    }
    
    public void printPascal(int rowIndex){
    	System.out.println("\n---Printing the triangle---\n");
    	for(int n=0; n <= rowIndex; n++){
    		int nCm = 1;
    		System.out.print(nCm + " ");
    		
    		for(int m=0; m < n; m++){
    			nCm = nCm * (n-m) / (m+1);
    			System.out.print(nCm + " ");
    		}
    		System.out.println();
    	}    
    }
    
    public static void main(String[] args){
    	Solution sol = new Solution();
    	List<Integer> result = sol.getRow(30);
    	
    	for(Integer i : result){
    		System.out.print(i + " ");
    	}
    	System.out.println();
    	sol.printPascal(5);
    }
    
    
}