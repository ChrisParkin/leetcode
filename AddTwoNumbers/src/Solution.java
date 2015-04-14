/**
 * You are given two linked lists representing two non-negative numbers. 
 * The digits are stored in reverse order and each of their nodes contain 
 * a single digit. Add the two numbers and return it as a linked list.
 *
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 */

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // create the new list
        ListNode previousNode = null;
        ListNode head         = null;
        double carry = 0;
        double sum   = 0;
        
        while(l1 != null && l2 != null){
            sum = Math.round(carry + l1.val + l2.val);
            carry = Math.floor(sum / 10);
            ListNode n = new ListNode((int)sum % 10);
            if(previousNode != null){
                previousNode.next = n;
            }else{
                head = n;
            }
            previousNode = n;
            l1 = l1.next;
            l2 = l2.next;
        }
        
        if(l1 == null && l2 == null){
            if(carry > 0){
                previousNode.next = new ListNode((int)carry);
            }
        }else if(l1 == null){
            previousNode.next = addTwoNumbers(new ListNode((int)carry), l2);
        }else{
            previousNode.next = addTwoNumbers(new ListNode((int)carry), l1);
        }
        return head;
    }
}
