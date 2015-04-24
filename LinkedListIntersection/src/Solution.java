import java.util.HashSet;
/**
 * Definition for singly-linked list.
 */
class ListNode {
     int val;
     ListNode next;
     ListNode(int x) {
         val = x;
         next = null;
     }
 }

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        if(headA == null || headB == null) return null;
        
        ListNode A = headA;
        ListNode B = headB;
        
        // get lengths of each
        // int aLen, bLen = 0;
        // while(A != null){
        //     aLen++;
        //     A = A.next;
        // }
        // while(B != null){
        //     bLen++;
        //     B = B.next;
        // }
        
        // THERE IS A FASTER APPROACH THAN BELOW USING THE LENGTHS AND ITERATING OVER LISTS
      
        
        // Create a set of elements found in A
        HashSet<Integer> elementsInA = new HashSet<>();
        while(A != null){
            elementsInA.add(A.val);
            A = A.next;
        }
        
        // Iterate through B and check for existence in A
        while(B != null){
            if(elementsInA.contains(B.val)){
                return B;
            }
            B = B.next;
        }
        return null;
    }
}