import java.util.List;
import java.util.ArrayList;

public class Solution {
    
	static String[] digitToLetter = new String[]{
		"", "","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"
	};
	
	public static List<String> letterCombinations(String digits) {
		
		List<String> result = new ArrayList<String>();
		if(digits.length() == 0) return result;
		
		for(int i=0; i<digits.length(); i++){
			String digit = digits.substring(i,i+1);
			if(!digit.equals("0") && !digit.equals("1")){
				result = concat(digits.substring(i,i+1), result);
			}
		}
		return result;
    }
	
	public static List<String> concat(String digit, List<String> result){
		String possible = digitToLetter[Integer.parseInt(digit)];
		List<String> res = new ArrayList<String>();
		
		if(result.size() == 0){
			for(int i=0; i<possible.length(); i++){
				res.add(possible.substring(i,i+1));
			}
		}else{
			for(String r : result){
				for(int i=0; i<possible.length(); i++){
					res.add(new String(r + possible.substring(i,i+1)));
				}
			}
		}
		return res;
	}
    
    public static void main(String[] args){
    	System.out.println(letterCombinations("23"));
    }
}