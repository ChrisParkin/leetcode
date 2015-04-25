public class Solution {
    public void merge(int A[], int m, int B[], int n) {
        
        int last = A.length - 1;
        int i = m-1;
        int j = n-1;
        
        while(i >= 0 && j >= 0){
            if(A[i] >= B[j]){
                A[last--] = A[i--];
            }else{
                A[last--] = B[j--];
            }
            
        }
        
        while(i >= 0){
            A[last--] = A[i--]; 
        }
        
        while(j >= 0){
            A[last--] = B[j--];
        }
    }
}