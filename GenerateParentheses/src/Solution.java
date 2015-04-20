
import java.util.ArrayList;
import java.util.List;

public class Solution{
	
	static List<String> l = new ArrayList<String>();
	
	public List<String> generateParenthesis(int n) {
		l.removeAll(l);
        addParenthesis(0,3,"");
        return l;
    }
	
	private void addParenthesis(int open, int remaining, String s){
		if(open == 0 && remaining == 0) l.add(s);
		if(remaining > 0) addParenthesis(open+1, remaining - 1, s + "(");
		if(open > 0) addParenthesis(open - 1, remaining, s + ")");
	}
	
	public static void main(String[] args){
		Solution sol = new Solution();
		sol.generateParenthesis(3);
		for(String s : l){
			System.out.println(s);
		}
	}
    
	
}