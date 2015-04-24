/**
 * Definition for singly-linked list.
 **/
 class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
 }
 

public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode newHead = new ListNode(-1);
        ListNode newPos = newHead;
        
        while(l1 != null && l2 != null){
            if(l1.val <= l2.val){
                newPos.next = l1;
                l1 = l1.next;
            }else{
                newPos.next = l2;
                l2 = l2.next;
            }
            newPos = newPos.next;
        }
        while(l1 != null){
            newPos.next = l1;
            l1 = l1.next;
            newPos = newPos.next;
        }
        
        while(l2 != null){
            newPos.next = l2;
            l2 = l2.next;
            newPos = newPos.next;
        }
        return newHead.next;
    }
}