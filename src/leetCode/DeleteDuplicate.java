package leetCode;

public class DeleteDuplicate {
	public ListNode deleteDuplicates(ListNode head) {
        if(head == null){
            return head;
        }
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        node1.next = head;
        node2.next = head.next;
        while(node2.next!=null&&node1.next!=null){
        	if(node1.next.val==node2.next.val){
        		node1.next.next  = node2.next.next;
        		node2.next = node2.next.next;
        	}else{
        	    node1.next = node1.next.next;
        	}
        }
        return head;
    }
}
