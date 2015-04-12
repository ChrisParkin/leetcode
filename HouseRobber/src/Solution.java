/*
 * You are a professional robber planning to rob houses along a street. 
 * Each house has a certain amount of money stashed, the only constraint 
 * stopping you from robbing each of them is that adjacent houses have 
 * security system connected and it will automatically contact the police
 * if two adjacent houses were broken into on the same night.
 *  
 * Given a list of non-negative integers representing the amount of money
 * of each house, determine the maximum amount of money you can rob tonight
 * without alerting the police.
 */

public class Solution {
	public int rob(int[] num) {
        // special cases
		if(num.length == 0) return 0;                          // 0 homes
		if(num.length == 1) return num[0]; 					   // 1 home
		if(num.length == 2) return Math.max(num[0],num[1]);    // 2 homes
		
		// otherwise for more than 2 homes...
		int[] maximums = new int[num.length];
		maximums[0] = num[0];
		maximums[1] = num[1];
		int prevMax = maximums[0];
		
		for(int i = 2; i < num.length; i++){	
			maximums[i] = Math.max(num[i] + prevMax, maximums[i-1]);
			prevMax = Math.max(prevMax, maximums[i-1]);
		}
		return maximums[maximums.length - 1];
    }
}
