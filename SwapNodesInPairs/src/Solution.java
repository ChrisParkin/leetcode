/**
 * Definition for singly-linked list.
*/
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
 
public class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) return head;
        
        ListNode rear = null;
        ListNode mid  = head;
        ListNode front = head.next;
        
        while(front != null){
            if(rear != null){
                rear.next = front;
            }else{
                head = front;
            }
            mid.next = front.next;
            front.next = mid;
            
            rear = mid;
            mid = rear.next;
            front = (mid == null) ? null : mid.next;
        }
        return head;
    }
}