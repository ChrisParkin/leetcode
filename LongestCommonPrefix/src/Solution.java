public class Solution {
    public String longestCommonPrefix(String[] strs) {
      
    	StringBuffer s = new StringBuffer();
      
    	for(int i = 0; i < strs[0].length(); i++){
    		char c = strs[0].charAt(i);
    		for(int j = 1; j < strs.length; j++){
    			if(strs[j].length() < (i + 1) || strs[j].charAt(i) != c){
    				return s.toString();
    			}
    		}
    		s.append(c);
    	}
    	return s.toString();
    }
    
    public static void main(String[] args){
    	String[] inputs = {
    			"Christopher Robinson",
    			"Christoph",
    			"Christopher",
    			"Christ",
    			"ChristopherDanielParkin"
    	};
    	Solution sol = new Solution();
    	System.out.println(sol.longestCommonPrefix(inputs));
    }
}