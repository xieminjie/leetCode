package leetCode;

public class RemoveNthFromEnd {
	public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode start = new ListNode(0);
		ListNode slow = start;
		ListNode fast = start;
		slow.next = head;
		for(int i=0;i<=n;i++){
			fast = fast.next;
		}
		while(fast.next!=null){
			fast = fast.next;
			slow = slow.next;
		}
		slow.next = slow.next.next;
        return start.next;
    }
}