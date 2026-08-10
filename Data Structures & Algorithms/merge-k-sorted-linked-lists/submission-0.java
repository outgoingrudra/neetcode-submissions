
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a,b)-> Integer.compare(a.val , b.val));
        for( ListNode l : lists){
            if(l!=null) pq.offer(l);
        }
        ListNode dummy = new ListNode(0);
        ListNode ans = dummy;
        while(pq.size()!=0){
            ListNode node = pq.poll();
             dummy.next = node ;
            dummy = dummy.next;
            if(node.next != null) pq.offer(node.next);
        }
        return ans.next ;
    }
}