import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<List<Integer>> generate(int numRows) {
        
    	List<List<Integer>> entries = new ArrayList<>();
        
    	for(int n = 0; n < numRows; n++){
    		List<Integer> row = new ArrayList<>();
            int nCm = 1;
            row.add(nCm);
            
            for(int m = 0; m < n; m++){
                nCm = nCm * (n-m) / (m+1);
               row.add(nCm);
            }
            entries.add(row);
        }
        return entries;
    }
    
    public static void main(String[] args){
    	List<List<Integer>> result = generate(5);
    	for(List<Integer> l : result){
    		System.out.print("[");
    		for(int i=0; i < l.size(); i++){
    			if(i > 0){
    				System.out.print(", ");
    			}
    			System.out.print(l.get(i));
    		}
    		System.out.print("]\n");
    	}
    }
}