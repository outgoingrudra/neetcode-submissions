/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Map<Node,Node> mpp = new HashMap<>();
        Node curr = head ;

        while(curr!=null){
            mpp.put(curr , new Node(curr.val));
            curr = curr.next ;
        }
        curr = head ;

        while(curr != null){
            Node n = mpp.get(curr);
            n.next = mpp.get(curr.next);
            n.random  = mpp.get(curr.random);

            curr = curr.next;
        }
        return mpp.get(head) ;
    }
}
