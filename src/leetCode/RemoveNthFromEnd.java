package leetCode;

public class RemoveNthFromEnd {
	public ListNode removeNthFromEnd(ListNode head, int n) {
		int length = 1;
		while(head.next!=null){
			head = head.next;
			length++;
		}
		if(n==1){
			head.next = head.next.next;
		}else{
			removeNthFromEnd(head.next,length-n);
		}
        return head;
    }
}