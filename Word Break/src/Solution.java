import java.util.HashSet;
import java.util.Set;

public class Solution{
	public static boolean wordBreak(String s, Set<String> wordDict){
		boolean[] foundWords = new boolean[s.length() + 1];
		foundWords[0] = true;
		for(int i = 1; i <= s.length(); i++){
			
			for(int j = 0; j < i; j++){
				
				if(foundWords[j] && wordDict.contains(s.substring(j,i))){
					foundWords[i] = true;
				}
			}
		}
		return foundWords[s.length()];
	}
	

	public static void main(String[] args){
		Set<String> s = new HashSet<>();
		s.add("aaaa");
		s.add("aa");
		System.out.println(wordBreak("aaaaaaa",s));
	}
}
