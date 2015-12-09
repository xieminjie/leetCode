package leetCode;

public class RemoveNthFromEnd {
	public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode listNode = new ListNode(0);
        int count = 1;
        while(head.next!=null){
        	ListNode listNode = head.next;
        	count++;
        }
        return listNode;
    }
}