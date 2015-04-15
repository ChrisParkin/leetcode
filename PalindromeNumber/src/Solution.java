/**
 * Determine whether an integer is a palindrome. Do this without extra space.
 * 
 * (For this I used a solution to a previous question where I reversed an integer)
 */
public class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0) return false;
        return(x == reverse(x));
    }
    
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
    
    public static void main(String[] args){
    	Solution sol = new Solution();
    	int[] inputs = {
    			121,212,211,-123
    	};
    	for(int in : inputs){
    		System.out.format("%d --> %s\n", in, sol.isPalindrome(in));
    	}
    }
}