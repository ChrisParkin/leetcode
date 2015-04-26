public class Solution {
    public int[] plusOne(int[] digits) {
        
        int[] result = new int[digits.length];
        int carry = 0;
        
        for(int i=digits.length-1; i >=0; i--){
            int one = (i == digits.length - 1) ? 1 : 0;
            result[i] = (digits[i] + one + carry) % 10;
            carry = (digits[i] + one + carry) / 10;
        }
        
        if(carry > 0){
            int r[] = new int[result.length + 1];
            r[0] = 1;
            for(int i=1; i < r.length; i++){
                r[i] = result[i-1];
            }
            result = r;
        }
        return result;
    }
}