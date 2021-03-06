import java.util.Set;
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
    
	// Using a HashSet
    public static boolean hasCycle(ListNode head) {
        Set<ListNode> seen = new HashSet<>();
        
        while(head != null){
            seen.add(head);
            if(seen.contains(head.next)){
                return true;
            }
            head = head.next;
        }
        return false;
    }
    
    // Without Using a HashSet
    public static boolean hasCycleSpaceEfficient(ListNode head){
    	
    	ListNode back = head;
    	ListNode front = head;
    	while(front != null && back != null){
    		if(back == front) return true;
    		back = back.next;
    		front = front.next.next;
    		
    	}
    	return false;
    }
    
    public static void main(String[] args){
    	ListNode ln = new ListNode(100);
    	ListNode ln2 = new ListNode(99);
    	ln.next = ln2;
    	ln2.next = new ListNode(98);
    	ln2.next.next = new ListNode(97);
    	ln2.next.next.next = ln2;
    	System.out.println(hasCycleSpaceEfficient(ln));
    	System.out.println(hasCycle(ln));
    }
}