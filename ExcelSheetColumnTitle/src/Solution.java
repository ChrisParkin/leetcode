
public class Solution {
	
	public static String convertToTitle(int n) {
		StringBuffer result = new StringBuffer();
		while(n > 0){
			if(n % 26 == 0){
				result.append('Z');
				n = n / 26 - 1;
			}else{
				result.append((char)(n % 26 + 'A' - 1));
				n = n / 26;
			}
		}
		return result.reverse().toString();
    }
	
	public static void main(String[] args){
		for(int i = 1; i < 256; i++){
			System.out.println(i + ": " + convertToTitle(i));
		}
	}
}
