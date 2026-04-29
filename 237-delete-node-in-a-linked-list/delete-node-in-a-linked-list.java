/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
         node.val = node.next.val;      // next value copy krenge 


        node.next = node.next.next; //  or agla node delte kr denge 

        //simple and smart solution

    }
}