/**
 * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like 
 * this: (you may want to display this pattern in a fixed font for better legibility) 
 *
 *	P   A   H   N
 *	A P L S I I G
 *	Y   I   R
 *
 *	And then read line by line: "PAHNAPLSIIGYIR"
 *	Write the code that will take a string and make this conversion given a number of rows:
 *	
 *	string convert(string text, int nRows);
 *	convert("PAYPALISHIRING", 3) should return "PAHNAPLSIIGYIR".
 *
 */
public class Solution {
	private static final int NUM_ROWS = 4;
	
	public Solution(){};
	
	public String convert(String s, int nRows) {
		
		if(nRows == 1) return s;
		
		char[] chars = new char[s.length()];
		int i, j;
		int index = 0;
		for(i = 0; i < nRows; i++){
			j = 0;
			while(j < (s.length() + i)){
				
				// handle rows between first and last
				if(i > 0 && i < nRows - 1 && j > i){
					chars[index] = s.charAt(j - i);
					index++;
				}
				
				// handle first/last rows or the first element
				if((j+i) < s.length()){
					chars[index] = s.charAt(j+i);
					index++;
				}
				j += 2*nRows - 2;
			}
		}
		return new String(chars);
	}
	
	public static void main(String[] args){
		Solution sol = new Solution();
		String[] inputs = {
				"paypalishiring"
		};
		for(String s : inputs){
			System.out.println("convert("+s+", " + NUM_ROWS + "): " + sol.convert(s,NUM_ROWS));
		}
	}
}
