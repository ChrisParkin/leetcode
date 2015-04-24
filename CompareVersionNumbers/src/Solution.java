
public class Solution {
	public static int compareVersion(String version1, String version2) {
      String[] v1 = version1.split("\\.");
      String[] v2 = version2.split("\\.");
      
      int i=0;
      int j=0;
      
      while(i < v1.length && j < v2.length){
          int val1 = Integer.parseInt(v1[i]);
          int val2 = Integer.parseInt(v2[j]);
          
          if(val1 > val2){
        	  return 1;
          }else if(val2 > val1){
        	  return -1;
          }
          i++;
          j++;
      }
      
      while(i < v1.length){
    	  if(Integer.parseInt(v1[i++]) > 0){
    		  return 1;
    	  }
    	  
      }
      
      while(j < v2.length){
    	  if(Integer.parseInt(v2[j++]) > 0){
    		  return -1;
    	  }
      }
    	 
      
      return 0;
      
    }
	
	public static void main(String[] args){
		String v1 = "0";
		String v2 = "1";
		System.out.println(compareVersion(v1,v2));
	}
}
