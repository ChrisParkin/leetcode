
public class Solution {
	public static int trailingZeroes(int n) {
        // relies on properties of factorial. Each time n increases by a multiple of 5, 
		// the number of trailing zeroes increases by 1.
		if(n < 5) return 0;
        int count = 0;
        while((int)n/5 >= 1){
            count += n / 5;
            n /= 5;
        }
        return count;
    }
	
	public static void main(String[] args){
		System.out.println(trailingZeroes(20));
	}
}
