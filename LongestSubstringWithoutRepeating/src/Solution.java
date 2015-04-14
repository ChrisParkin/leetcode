import java.util.HashMap;
import java.util.HashSet;
/**
 * Given a string, find the length of the longest substring without repeating characters. 
 * For example, the longest substring without repeating letters for "abcabcbb" is "abc", 
 * which the length is 3. For "bbbbb" the longest substring is "b", with the length of 1.
 *
 */
public class Solution {
    public static int lengthOfLongestSubstring(String s) {
        
    	HashMap<Character,Integer> map = new HashMap<>();
    	char[] chars = s.toCharArray();
    	
    	int maxlen = 0;
    	int len    = 0;
        int start  = 0;
        int pos    = 0;
        for(int i=0; i<chars.length; i++){
        	if(map.containsKey(chars[i])){
        		pos = map.get(chars[i]);
        		if(pos < start){
        			len++;
        			map.put(chars[i],  i);
        		}else{
        			start = pos + 1;
        			map.put(chars[i],  i);
        			maxlen = Math.max(len, maxlen);
        			len = i - start + 1;
        		}
        	}else{
        		len++;
        		map.put(chars[i], i);
        	}
        }
        return Math.max(len, maxlen);
    }
    
    public static void main(String[] args){
    	String[] inputs = {"abcabcab", "bbbbbb", "abcabdecd",
    					   "pwwkew"  , "cdd",    "ohvhjdml"};
    	for(String s : inputs){
    		System.out.format("%s: %d\n",s,lengthOfLongestSubstring(s));
    	}
    }
}