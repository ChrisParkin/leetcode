import java.util.Arrays;

public class Solution {
    public static int findMin(int[] nums) {
    	if(nums.length == 0) return 0;
    	if(nums.length == 1) return nums[0];
    	int first = nums[0];
    	int mid = nums.length/2;
    	int[] left = Arrays.copyOfRange(nums, 0, mid);
    	int[] right = Arrays.copyOfRange(nums, mid, nums.length);
    	
    	if(left.length > 0 && left[left.length-1] < first){
    		return findMin(left);
    		
    	}else if(right.length > 0 && right[right.length-1] < first){
    		return findMin(right);
    		
    	}else{
    		return first;
    	}
    }
    
	
	
//	
//    public static int findMin(int[] nums){
//    	int i=0;
//    	int j=nums.length-1;
//    	int mid;
//    	
//    	while(i < j-1){
//    		mid = (j-i)/2;
//    		if(nums[i] > nums[mid]){
//    			j = mid;
//    		}else{
//    			i = mid;
//    		}
//    	}
//    	
//    	return nums[j];
//    }
	
    public static void main(String[] args){
    	int[] input = new int[]{6,0,1,2,3,4};
    	System.out.println(findMin(input));
    }
}