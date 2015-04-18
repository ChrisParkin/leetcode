import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;

public class Solution {
	
	public boolean isValid(String s) {
		HashMap<Character, Character> matches = new HashMap<>();
		matches.put(')','(');
		matches.put('}','{');
		matches.put(']','[');
		
		HashSet<Character> openers = new HashSet<>();
		openers.add('(');
		openers.add('{');
		openers.add('[');
		
		HashSet<Character> closers = new HashSet<>();
		closers.add(')');
		closers.add('}');
		closers.add(']');
		
		Stack<Character> opens = new Stack<>();
		char c;
		char o;
		for(int i=0; i < s.length(); i++){
			c = s.charAt(i);
			
			if(openers.contains(c)){
				opens.push(c);
			}else if(closers.contains(c)){
				
				if(opens.isEmpty()){
					return false;
				}
				
				o = opens.pop();
				if(matches.get(c) != o){
					return false;
				}
			}
		}
		return opens.isEmpty();
    }
	/*
	 * originally used the following functions to check 
	 * if it was an opener or closer. then switched to a hashSet
	 */
	private boolean isOpener(char c){
		return (c == '(' || c == '{' || c == '[');
	}
	private boolean isCloser(char c){
		return (c == ')' || c == '}' || c == ']');
	}
    
    public static void main(String[] args){
    	Solution sol = new Solution();
    	String[] inputs = {
    			"","()","{}","[]","(}","{(}"
    	};
    	
    	for(String in : inputs){
    		System.out.format("%s...\t%b\n", in, sol.isValid(in));
    	}
    }
}