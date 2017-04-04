/**
 * Reverse a singly linked list.
 */
 
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
 

/**
 * Author: Recho
 * Java 1.7
 * 递归算法，最底层为链表中两个元素的交换
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


/**
 * 非递归算法，使用栈存储中间节点
 */

public class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;
        
        Deque<ListNode> stack = new LinkedList<ListNode>();
        ListNode current = head;
        while(current.next != null){
            stack.offerLast(current);
            current = current.next;
        }
        
        ListNode top = current;
        
        while(!stack.isEmpty()){
            ListNode next = stack.pollLast();
            current.next = next;
            next.next = null;
            current = next;
        }
        
        return top;
    }
}
