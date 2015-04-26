import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int singleNumber(int[] nums) {
        
        
        Set<Integer> ones   = new HashSet<Integer>();
        Set<Integer> threes = new HashSet<Integer>();
        
        int n;
        for(int i = 0; i < nums.length; i++){
            n = nums[i];
            if(ones.contains(n)){
                threes.add(n);
                ones.remove(n);
            }else if(!threes.contains(n)){
                ones.add(n);
            }
        }
        Object[] one = ones.toArray();
        return (int)((Integer)one[0]);
        
    }
}