public class Solution {
    
    public static int canCompleteCircuit(int[] gas, int[] cost) {
        // if there's only one stop, check it
    	if(gas.length == 1){
        	if((gas[0] - cost[0]) >= 0){
        		return 0;
        	}
        	return -1;
        }
        // otherwise, do our calculations
    	int start = 0;
        
    	while(start < gas.length){
            int tank = gas[start] - cost[start];    
            int end = (start == gas.length - 1) ? 0 : start+1;
            System.out.println("Start: " + start + ", End: " + end);
            
            while(tank >= 0 && start != end){
            	System.out.println("Looping --> Start: " + start + ", End: " + end);
                tank += (gas[end] - cost[end]);
                end = (end == gas.length - 1) ? 0 : end+1;
            }
            
            if(tank >= 0) return start;
            
            start = (end <= start) ? gas.length : end;
        }
        return -1;
    }
    
    public static void main(String[] args){
//    	int[] gas = new int[]{6,0,1,3,2};
//    	int[] cost = new int[]{4,5,2,5,5};
    	
    	int[] gas = new int[]{1,5,2,4,4};
    	int[] cost = new int[]{4,3,2,6,1};
    	
//    	int[] gas = new int[]{2,4};
//    	int[] cost = new int[]{3,4};
    	
    	System.out.println(canCompleteCircuit(gas,cost));
    }
}