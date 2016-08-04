package leetCode;

public class SwapNodes {
	public ListNode swapPairs(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode node = head.next;
        head.next = swapPairs(head.next.next);
        node.next = head;
        return node;
    }
}
