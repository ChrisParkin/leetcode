public class Solution {
    // you need treat n as an unsigned value
	 public int reverseBits(int n) {
		int result = 0;
		int i = 0;
		while(i < 32){
			result = result << 1 | (n&1);
			n = n >>> 1;
			i++;
		}
		return result;
	 }
    
    public static void main(String[] args){
    	Solution sol = new Solution();
    	System.out.println(sol.reverseBits(43261596));
    }
}