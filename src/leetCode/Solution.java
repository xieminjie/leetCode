package leetCode;

public class Solution {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if(l1==null){
			return l2;
		}
		if(l2==null){
			return l1;
		}
		if(l1==null&&l2==null){
			return null;
		}
		ListNode start = new ListNode(0);
		ListNode pointer = start;
		while(l1!=null&&l2!=null){
			if(l1.val<=l2.val){
				pointer.next = l1;
				l1 = l1.next;
			}else{
				pointer.next = l2;
				l2 = l2.next;
			}
			pointer = pointer.next;
		}
		if(l1!=null){
			pointer.next = l1;
		}
		if(l2!=null){
			pointer.next = l2;
		}
		return start.next;
	}
}