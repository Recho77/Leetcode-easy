/**
 * Reverse a singly linked list.
 */

/**
 * Author: Recho
 * Java 1.7
 * 递归算法，最底层为链表中两个元素的交换
 */
 
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
 
public class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;
        
        ListNode top = head;
        while(top.next != null) top = top.next;
        recursiveReverse(head);
        return top;
    }
    
    public void recursiveReverse(ListNode node){
        if(node.next.next != null){
            recursiveReverse(node.next);
        }
        node.next.next = node;
        node.next = null;
    }
}
