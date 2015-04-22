import java.util.Arrays;
public class Solution {
	
	// TOO SLOW
//	public static void rotate(int[] nums, int k) {
//        // check that it should rotate at all
//		k = k % nums.length;
//        if(k > 0){
//        	int tmp = 0;
//        	for(int i = 0; i < k; i++){
//        		tmp = nums[nums.length - 1];
//        		for(int j = nums.length - 1; j > 0; j--){
//        			nums[j] = nums[j-1];
//        		}
//        		nums[0] = tmp;
//        	}
//        }
//       
//    }
	public static void rotate(int[] nums, int k) {
        int[] tmp = new int[k];
        int index = 0;
        k = k % nums.length;
        if(k > 0){
	        // create the tmp shift
	        for(int i = nums.length - k; i < nums.length; i++){
	        	tmp[index++] = nums[i];
	        }
	        
	        // shift everything else
	        for(int i = nums.length - 1; i > k-1; i--){
	        	nums[i] = nums[i-k];
	        }
	        
	        // put the original back in
	        for(int i = 0; i < k; i++){
	        	nums[i] = tmp[i];
	        }
        }
    }

	public static void main(String[] args){
		int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10};
		rotate(arr, 1);
		System.out.println(Arrays.toString(arr));
		rotate(arr, 2);
		System.out.println(Arrays.toString(arr));
		rotate(arr, 3);
		System.out.println(Arrays.toString(arr));
		rotate(arr, 4);
		System.out.println(Arrays.toString(arr));
		rotate(arr, 5);
		System.out.println(Arrays.toString(arr));
		rotate(arr, 6);
		System.out.println(Arrays.toString(arr));
		rotate(arr, 7);
		System.out.println(Arrays.toString(arr));
		rotate(arr, 8);
		System.out.println(Arrays.toString(arr));
		rotate(arr, 9);
		System.out.println(Arrays.toString(arr));
		rotate(arr, 10);
		System.out.println(Arrays.toString(arr));
		rotate(arr, 11);
		System.out.println(Arrays.toString(arr));
		rotate(arr, 12);
		System.out.println(Arrays.toString(arr));
	}
}
