/**
 * Definition for singly-linked list.
 * class ListNode {
 *     constructor(val = 0, next = null) {
 *         this.val = val;
 *         this.next = next;
 *     }
 * }
 */

class Solution {
    /**
     * @param {ListNode} head
     * @param {number} n
     * @return {ListNode}
     */
    removeNthFromEnd(head, n) {
       let x  = new ListNode(0)
       x.next = head
       let f = x;
       let s = x;
       while(n!=0){
        f=f.next;
        n--
       }
       while(f.next){
        f=f.next
        s=s.next
       }
       s.next =s.next.next
       return x.next
    }
}
