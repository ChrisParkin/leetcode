import java.util.HashSet;


public class Solution {

	public static boolean isHappy(int n){
		int total = 0;
		HashSet<Integer> seen = new HashSet<>();
		
		while(n > 0){
			total += Math.pow(n%10, 2);
			n = n/10;
			if(n == 0){
				n = total;

				if(total == 1){
					return true;
				}else if(seen.contains(n)){
					return false;
				}
				seen.add(n);
				total = 0;
			}
			
		}
		return false;
	}
	
	public static void main(String[] args){
		System.out.println(isHappy(2));
	}
}
