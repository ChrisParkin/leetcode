/**
 * Implement atoi to convert a string to an integer.Hint: Carefully consider all possible input cases. 
 * If you want a challenge, please do not see below and ask yourself what are the possible input cases.
 * 
 * Notes: It is intended for this problem to be specified vaguely (ie, no given input specs). You are 
 * responsible to gather all the input requirements up front.
 *
 */
public class Solution {
    public int myAtoi(String str) {
        
        int numeric = 0;
        
        boolean add      = false;
        boolean subtract = false;
        
        try{
        	char c;
	        for(int i = 0; i < str.length(); i++){
	        	c = str.charAt(i);
	        	if(c == '+'){
	        		add = true;
	        	}else if(c == '-'){
	        		subtract = true;
	        	}else if(Character.isDigit(c)){
	        		
	        		if(add || subtract){
		        		if(subtract){
		        			numeric -= Integer.parseInt(str.substring(i,i+1));
		        			subtract = false;
		        		}
		        		if(add){
		        			numeric += Integer.parseInt(str.substring(i,i+1));
		        			add = false;
		        		}
	        		}else{
	        			numeric += Integer.parseInt(str.substring(i,i+1));
	        		}
	        		if(i < str.length() - 1){
	        			numeric *= 10;
	        		}
	        	}
	        }
	        
	        return numeric;
        }catch(Exception e){
        	System.out.println(e.getMessage());
        	return 0;
        }
    }
    
    public static void main(String args[]){
    	Solution sol = new Solution();
    	String[] inputs = {
    		"1","-12","123","1234"
    	};
    	for(String s : inputs){
    		System.out.format("%s --> %d\n",s,sol.myAtoi(s));
    	}
    }
}