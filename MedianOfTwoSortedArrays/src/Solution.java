import java.util.LinkedList;
public class Solution {
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		
        int i=0;
        int j=0;
        
        Double front = null;
        Double back = null;
        
        int totalLength = (nums1.length + nums2.length);
        int medianLength = totalLength / 2;
        
        while(nums1.length > i && nums2.length > j && (i + j) <= medianLength){
        	back = front;
        	if(nums1[i] <= nums2[j]){
        		front = nums1[i++]*1.0;
        		
        	}else{
        		front = nums2[j++]*1.0;
        	}
        }
         
        while((i+j) <= medianLength){
        	if(nums1.length > i){
        		back = front;
        		front = nums1[i++] * 1.0;
        	}
        	
        	if(nums2.length > j){
        		back = front;
        		front = nums2[j++] * 1.0;
        	}
        }
        
        
    	if(totalLength % 2 == 0){
    		return ((front + back) / 2);
    	}else{
    		return front;
    	}
    }
	
	public static void main(String[] args){
		Solution sol = new Solution();
		int[] a = new int[]{2,4,6};
		int[] b = new int[]{1,3,5,7};
		//1,2,3,4,5,6,7,8,8,10
		System.out.println(sol.findMedianSortedArrays(a,b));
		System.out.println(sol.findMedianSortedArrays(new int[1],b));
		
	}
}
