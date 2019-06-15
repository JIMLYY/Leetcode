
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null) return head;
        // Two pointers
        ListNode fast = head;
        ListNode slow = head;
        int len = 0;

        // calculate the length of List
        while(fast != null){
            len ++;
            fast = fast.next;
        }
        // set fast back to head
        fast = head;

        // move fast pointer k nodes or k % len nodes
        for(int i = 0; i < k % len; i++){
            fast = fast.next;
        }
        // move the fast and slow pointers at the same time until the fast node reach the last node
        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }

        //transform the current ListNode
        fast.next = head;
        head = slow.next;
        slow.next = null;
        return head;
    }
}

/*
TC: O(N) N is the number of nodes
SC: O(1)
*/
