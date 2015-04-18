import java.util.HashMap;

public class Solution {
	private static HashMap<Integer,String> rom = new HashMap<>();
	static{
		rom.put(1,    "I");
		rom.put(4,    "IV");
		rom.put(5,    "V");
		rom.put(9,    "IX");
		rom.put(10,   "X");
		rom.put(50,   "L");
		rom.put(100,  "C");
		rom.put(500,  "D");
		rom.put(1000, "M");
	}
	private static String[][] table = {
			{"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"},
            {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"},
            {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"},
            {"", "M", "MM", "MMM"}
           };
	
	public String intToRoman(int num) {
		if(num < 1 || num > 3999) return "";
		
		String simple = rom.get(num);
		if(simple != null){
			return simple;
		}
		if(num >= 1000){
			return "M" + intToRoman(num - 1000);
		}
		if(num >= 900){
			return "CM" + intToRoman(num - 900);
		}
		if(num >= 500){
			return "D" + intToRoman(num - 500);
		}
		if(num >= 400){
			return "CD" + intToRoman(num - 400);
		}
		if(num >= 100){
			return "C" + intToRoman(num - 100);
		}
		if(num >= 90){
			return "XC" + intToRoman(num - 90);
		}
		if(num >= 50){
			return "L" + intToRoman(num - 50);
		}
		if(num >= 40){
			return "XL" + intToRoman(num - 40);
		}
		if(num >= 10){
			return "X" + intToRoman(num - 10);
		}
		if(num >= 5){
			return "V" + intToRoman(num - 5);
		}
		return "I" + intToRoman(num-1);
	}
	
	// another solution someone posted on LeetCode (slightly slower)
	public String intToRomanAgain(int num) {
	    
	    String result = "";
	    int count = 0;
	    while(num > 0){
	        int temp = num % 10;
	        result = table[count][temp] + result;
	        num /= 10;
	        count++;
	    }
	    return result;
	}
	
	public static void main(String[] args){
		Solution sol = new Solution();
		int[] inputs = {
				1,2,3,4,5,6,7,8,9,
				10,11,12,15,18,20,
				25,35,41,49, 65, 200,
				401,254,276,486,500,510,675,
				1254,3452,3768,3111,3999
				};
		for(int i : inputs){
			String a = sol.intToRoman(i);
			String b = sol.intToRomanAgain(i);
			System.out.format("%d: %s,%s (%b)\n",i,a, b, a.equals(b));
		}
	}
}
