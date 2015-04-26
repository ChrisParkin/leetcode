import java.util.List;
import java.util.ArrayList;

public class Solution {
    
    public static List<List<String>> findPalindromes(String s){
        
        List<List<String>> parts = new ArrayList<>();
        
        for(int i=1; i<=s.length(); i++){
            List<String> tmp = new ArrayList<>();
            
            for(int j=0; j<i; j++){
                if(isPalindrome(s.substring(j,i))){
                    tmp.add(s.substring(j,i));        
                }
            }
            parts.add(tmp);
        }
        return parts;
    }
    
    
    public static boolean isPalindrome(String s){
        int i = 0;
        int j = s.length()-1;
        while(i<=j){
        	if(s.charAt(i++) != s.charAt(j--)){
        		return false;
        	}
        }
        return true;
    }
    
    public static void getPaths(List<List<String>> parts, List<String> previous, int pIndex, List<List<String>> result){
    	
    	for(int i=0; i<parts.get(pIndex).size(); i++){
    		List<String> newList = (ArrayList<String>)(((ArrayList<String>)previous).clone());
    		String s = parts.get(pIndex).get(i);
    		newList.add(0, s);
    		if(pIndex - s.length() >= 0){
    			getPaths(parts, newList, pIndex - s.length(), result) ;
    		}else{
    			result.add(newList);
    		}
    	}
    }
    
    public static List<List<String>> partition(String s) {
        
        List<List<String>> parts = findPalindromes(s);
        List<List<String>> result = new ArrayList<>();
        List<String> previous = new ArrayList<>();
        getPaths(parts, previous, parts.size()-1, result);
        return result;
        
    }
    
    public static void main(String[] args){
    	String s = "abaab";
    	List<List<String>> paths = partition(s);
    	System.out.println(paths.toString());
//    	List<List<String>> parts = findPalindromes(s);
//    	List<List<String>> paths = new ArrayList<>();
//    	getPaths(parts, new ArrayList<String>(), parts.size()-1, paths);
//    	System.out.println(paths);
    	
    }
}