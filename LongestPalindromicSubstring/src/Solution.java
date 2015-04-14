
public class Solution {
	public static String longestPalindrome(String s) {
        char[] chars = s.toCharArray();
        int windowSize = s.length();
        
        int left  = 0;
        int right = 0;
        
        while(windowSize >= 0){
        	for(int i=0; i<(s.length() - windowSize + 1); i++){
        		
        		left  = i; 
        		right = i + windowSize - 1;
        		
        		while(left < right && chars[left] == chars[right]){
        			left++; 
        			right--;
        		}
        		
        		if(left >= right){
        			return s.substring(i, i+windowSize);
        		}
        	}
        	windowSize--;
        }
        return "";
    }
	
	public static void main(String args[]){
		String[] inputs = {
				"abcba", "abcdabba", "madamimadam",
				"abcdadefg"
		};
		for(String in : inputs){
			System.out.format("%s: %s\n",in,longestPalindrome(in));
		}
		
	}
}
