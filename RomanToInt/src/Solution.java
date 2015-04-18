import java.util.HashMap;


public class Solution {
	private static HashMap<Character,Integer> rom = new HashMap<>();
	static{
		rom.put('I',    1);
		rom.put('V',    5);
		rom.put('X',    10);
		rom.put('L',    50);
		rom.put('C',    100);
		rom.put('D',    500);
		rom.put('M',    1000);
	}
	public int romanToInt(String s){
		
		if(s.length() == 1){
			return rom.get(s.charAt(0));
		}
		
		int a;
		int b;
		int result = 0;
		boolean addLast = true;
		
		for(int i = 0; i < s.length()-1; i++){
			a = rom.get(s.charAt(i));
			b = rom.get(s.charAt(i+1));
			
			if(a >= b){
				result += a;
			}else{
				result += (b-a);
				i++;
				if(i == s.length() - 1){
					addLast = false;
				}
			}
		}
		if(addLast == true){
			result += rom.get(s.charAt(s.length() - 1));
		}
		return result;
	}
	public static void main(String[] args) {
		String inputs[] = {
				"I", "II", "III", "IV","V",
				"VI","VII","VIII","IX","X",
				"MCMXCVI", "MDCCCLXXXIV","DCXXI"
		};
		Solution sol = new Solution();
		for(String s : inputs){
			System.out.format("%s: %d\n", s, sol.romanToInt(s));
		}

	}

}
