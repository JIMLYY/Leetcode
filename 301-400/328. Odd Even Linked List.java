/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head == null){
            return null;
        }
        ListNode odd = head, evenHead = odd.next, even = evenHead;
        while(even != null && even.next != null){
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;
    }
}
/*
Topic: Linked List
Algorithms:
1. construct the head and tail pointers for both oddList and eventList
The variables head and odd are the head pointer and tail pointer of
oddList; the variables evenHead and even are the head
pointer and tail pointer of evenList.
2. Traverse the original LinkedList
3. put the odd nodes into the oddList
4. put the even nodes into evenList
5. link two list.
Time: O(N). There are total N nodes. We visited each node once.
Space: O(1)
*/
