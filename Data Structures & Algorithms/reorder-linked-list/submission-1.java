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
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) return;

        // 1. Find middle
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // 2. Reverse second half
        ListNode h2 = slow.next;
        slow.next = null;

        h2 = reverseList(h2);

        // 3. Merge alternately
        ListNode h1 = head;
          while(h2!=null){
            ListNode n1 = h1.next;
            ListNode n2 = h2.next;

            h1.next = h2;
            h2.next = n1;
            h1 = n1;
            h2 = n2;
          }

    }
        public ListNode reverseList(ListNode head) {
        ListNode prev =  null ;
        ListNode next =  head ;
        ListNode temp = head ;
        while(temp != null){
            next = temp.next;
            temp.next  = prev;
            prev = temp ;
            temp = next;

        }
        return prev ;
    }

}