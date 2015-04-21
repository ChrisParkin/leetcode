
public class Solution {

	// you need to treat n as an unsigned value
    public int hammingWeight(int n) {
       int count = 0;
  
       while(n != 0){
    	   count += n&1;
    	   n = n>>>1;
       }
       return count;
    }
	
	public static void main(String[] args) {
		Solution sol = new Solution();
		System.out.println("15 = 1111: " + sol.hammingWeight(15));
		System.out.println("16 = 00010000: " + sol.hammingWeight(16));
	}

}
