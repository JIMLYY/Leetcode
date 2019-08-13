/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode smallHead = new ListNode(0);
        ListNode small = smallHead;
        ListNode bigHead = new ListNode(0);
        ListNode big = bigHead;


    while(head != null){
        if(head.val < x){
            small.next = head;
            small = small.next;
        }else{
            big.next = head;
            big = big.next;
        }
        head = head.next;
    }
        big.next = null;
        small.next = bigHead.next;
        return smallHead.next;
}
}
/*
Topic: LinkedList
Algorithms:
Basically, we need to reform the list.
1. we need two LinkedList
2. one is for all the elements which are smaller than x
3. one is for all the elements which are bigger than x
4. link them together.
Time: O(N)
Space: O(1)
*/
