import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
/**
 * 
 * Given an array of integers, find two numbers such that they add up to a specific target number.
 * 
 * The function twoSum should return indices of the two numbers such that they add up to the target, 
 * where index1 must be less than index2. Please note that your returned answers (both index1 and 
 * index2) are not zero-based.
 * 
 * You may assume that each input would have exactly one solution.
 * 
 * Input: numbers={2, 7, 11, 15}, target=9
 * Output: index1=1, index2=2
 *
 */
public class Solution {
	public static int[] twoSum(int[] numbers, int target) {
		
		// convert the numbers into list form
		List<Integer> intList = new ArrayList<Integer>();
		for(int i=0; i<numbers.length; i++){
			intList.add(numbers[i]);
		}
		
		// generate a set of the numbers (for searching)
		HashSet<Integer> nums = new HashSet<>();
		nums.addAll(intList);
		
		// search for the pair summing to target
		int a = 0;
		int b = 0;
		for(int i=0; i<intList.size() - 1; i++){
			if(nums.contains(target - intList.get(i))){
				a = intList.indexOf(intList.get(i));
				b = intList.lastIndexOf(target - intList.get(i));
				if(a != b){
					return new int[] {a+1,b+1};
				}
			}
		}
		return new int[]{0, 0};
		
// NAIVE APPROACH (TOO SLOW!)
//		int retval[] = new int[2];
//		outerloop:
//        for(int i=0; i < numbers.length; i++){
//        	
//        	for(int j=i+1; j < numbers.length; j++){
//        		if(numbers[i] + numbers[j] == target){
//        			retval[0] = i+1;
//        			retval[1] = j+1;
//        			break outerloop;
//        		}
//        	}
//        }
//        return retval;
    }
	
	public static void main(String[] args){
//		int[] nums = {2,7,11,15};
		int[] nums = {-3,4,3,90};
		int   trgt = 87;
		int[] indeces = twoSum(nums,trgt);
		System.out.format("index1=%d, index2=%d",indeces[0],indeces[1]);
	}
}
