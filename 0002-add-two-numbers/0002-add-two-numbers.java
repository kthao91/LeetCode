/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode prev = new ListNode(), node = prev; 
        int carry = 0; 

        while (l1 != null || l2 != null || carry != 0) { 

            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0; 

            int sum = x + y + carry; 
            int digit = sum % 10; 
            carry = sum / 10; 

            ListNode newNode = new ListNode(digit);
            node.next = newNode;
            node = newNode; 

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;

        }

        return prev.next;
        
    }
}