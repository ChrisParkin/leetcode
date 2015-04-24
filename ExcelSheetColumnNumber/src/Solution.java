import java.util.HashMap;

public class Solution {
    
	// Realized after that I could just skip this creation and use the qualities of character
	// values to reference them
	private static HashMap<Character,Integer> map = new HashMap<>();
    static{
    	char[] chars = {
        'A','B','C','D','E','F','G','H','I','J','K','L','M','N',
        'O','P','Q','R','S','T','U','V','W','X','Y','Z'
    	};
    	for(int i = 0; i < chars.length; i++){
            map.put(chars[i], i+1);
        }
    };
    
    public int titleToNumber(String s) {
    	if(s.equals("")) return 0;
    	if(s.length() == 1) return map.get(s.charAt(0));
    	
    	int retval = 0;
    	for(int i=s.length()-1; i >= 0; i--){
    		 retval += map.get(s.charAt(i)) * Math.pow(26,s.length()-1-i);
// the following line simplifies and avoids having to create the hash
//    		retval += (s.charAt(i) - 'A' + 1) * Math.pow(26,s.length()-1-i);
    	}
    	return retval;
    }
    
    public static void main(String[] args){
    	Solution sol = new Solution();
    	String[] inputs = {
    			"A", "B","C","D","E","F","G","H","I","J","K","X","Y","Z",
    			"AA","AB","AY","AZ","BA","BB","BC","BY","BZ",
    			"CA","CB","CD"
    	};
    	for(String s : inputs){
    		System.out.format("%s = %d\n", s, sol.titleToNumber(s));
    	}
    }
}