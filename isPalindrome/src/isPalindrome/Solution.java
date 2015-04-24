package isPalindrome;

public class Solution {
    public static boolean isPalindrome(String s) {
        
        if(s.equals("")) return true;
        
        int i = 0;
        int j = s.length() - 1;
        
        
        while(i <= j){
        	if(!Character.isLetterOrDigit(s.charAt(i))){
                i++;
                
            }else if(!Character.isLetterOrDigit(s.charAt(j))){
                j--;
                
            }else{
            	if(Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))){
            
	                return false;
	            }   
            	i++; j--;
            }
        }
        return true;
    
    }
    
    public static void main(String[] args){
    	String[] inputs = {
    			"Chris",
    			"chrisirhc",
    			"ChrisirhC",
    			"Chrisirhc",
    			"a.b.c.b.a",
    			"a, b, c, d, d, c, b, a"
    	};
    	for(String s : inputs){
    		System.out.format("%s: %b\n",s,isPalindrome(s));
    	}
    }
}