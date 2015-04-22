import java.util.*;

class Solution {
    int min = 0;
    ArrayList<Integer> data = new ArrayList<>();

    public void push(int x) {
        if(data.size() == 0){
            min = x;
        }else{
            min = Math.min(min,x);
        }
        data.add(x);
    }

    public void pop() {
        boolean needsReset = (top() == min);
    	data.remove(data.size() - 1);
    	if(needsReset){
    		setMin();
    	}
        
    }

    public int top() {
        return data.get(data.size() - 1);
    }

    public int getMin() {
        return min;
    }
    
    private void setMin(){
        if(data.size() > 0){
            min = data.get(0);
            for(int i = 0; i < data.size(); i++){
                min = Math.min(min, data.get(i));
            }
        }
    }
    
    public static void main(String[] args){
    	Solution sol = new Solution();
    	sol.push(1);
    	sol.push(2);
    	sol.push(3);
    	System.out.println(sol.top());
    	sol.push(-5);
    	System.out.println(sol.getMin());
    	sol.pop();
    	System.out.println(sol.getMin());
    }
}