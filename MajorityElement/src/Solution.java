import java.util.Arrays;
import java.util.HashMap;

public class Solution{
	
	// using a bitmap (SOLUTION #1)
	public static int majorityElement(int[] nums){
		
		int[] bitMap = new int[32];
		
		// increment the bitmap as appropriate
		for(int i=0; i<nums.length; i++){
			for(int j=0; j<32; j++){
				if(((nums[i] >> j) & 1)==1){
					bitMap[j]++;
				}
			}
		}
		
		// read the result from the bitmap
		int result = 0;
		for(int i=0; i<bitMap.length; i++){
			if(bitMap[i] > (nums.length/2)){
				result = result | 1 << i;
			}
		}
		return result;
	}
	// Using Sorting (SOLUTION #2)
//	public static int majorityElement(int[] nums) {
//		int count = 1;
//		Arrays.sort(nums);
//		return nums[nums.length/2];
//	}
	
	// SOLUTION #3 (meh)
//	public static int majorityElement(int[] nums){
//		
//		int count = 0;
//		int prev = nums[0];
//		int maj = 0;
//		
//		for(int i = 0; i < nums.length; i++){
//			if(nums[i] == prev){
//				count++;
//			}else{
//				if(count == 0){
//					prev = nums[i];
//				
//				}else{
//					count--;
//				}
//			}
//			if(count > nums.length/2) return prev;
//		}
//		return prev;
//		
//	}
		/* SOLUTION #4
		 * I didn't read the question correctly. The following finds the element
		 * occuring as a majority (or the mode) of the list, and is more complex
		 * than need be. Above is the majority element code
		public static int majorityElement(int[] nums) {
		if(nums.length == 0) return -1;
        HashMap<Integer,Integer> counts = new HashMap<>();
        int maxKey = 0;
        int maxVal = 0;
        
        for(int i=0; i < nums.length; i++){
            if(!counts.containsKey(nums[i])){
                counts.put(nums[i], 0);
            }
            
            int k = counts.get(nums[i]);
            counts.put(nums[i], k + 1);
            
            if(k+1 > (nums.length / 2)){
                return nums[i];
            }
            
            if(k+1 > maxVal){
            	maxVal = k+1;
            	maxKey = nums[i];
            }
        }
        
        // find the max and print it
        return maxKey;
     
    }
       */
	
	public static void main(String[] args){
		int[] input = {
				4,5,4
		};
		System.out.println("Majority element: " + majorityElement(input));
	}
}