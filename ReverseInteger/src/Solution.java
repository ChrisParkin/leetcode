
/**
 * Reverse digits of an integer.
 * 
 * Example1: x = 123, return 321
 * Example2: x = -123, return -321
 *
 */
public class Solution {
	
	public int reverse(int x){
			try{
				// use a double to check for overflow before returning
				double reverse = 0;
				boolean negative = x < 0;
				if(negative) x *= -1;
				
				while(x > 0){
					reverse += x % 10;
					x /= 10;
					if(x > 0) reverse *= 10;
				}
				// This was done to handle overflow tests
				if(reverse > Integer.MAX_VALUE){
					return 0;
				}
				if(negative) reverse *= -1;
				return (int)reverse;
				
			}catch(Exception e){
				return 0;
			}
	}
	
	public static void main(String args[]){
		Solution sol = new Solution();
		int[] inputs = {1234, 4321, 1212, -123, -321, 1056389759};
		for(int num : inputs){
			System.out.format("%d --> %d\n", num, sol.reverse(num));
		}
	}
}
