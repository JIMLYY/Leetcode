/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode plusOne(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode LastNotNine = dummy;
        ListNode node = head;
        while(node != null){
            if(node.val != 9){
                LastNotNine = node;
            }
            node = node.next;
        }
        LastNotNine.val ++;
        node = LastNotNine.next;
        while(node != null){
            node.val = 0;
            node = node.next;
        }
        return dummy.val == 1? dummy:head;
    }
}

/*
Topic: LinkedList
Algorithms:
1. generate a dummy node, which points to head
2. generate two ListNode: LastNotNine is the node which we eventually add 1 to; node is used to iterate the LinkedList
3. After we add one to LastNotNine, we need to make the value of following nodes 0.
4. determine if the value of dummy node is 1. If it is i, return dummy node. Otherwise, return dummy.next (or head)
Time: O(N)
Space: O(1)
*/
