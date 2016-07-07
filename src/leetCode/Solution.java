package leetCode;

import java.util.ArrayList;

public class Solution {
	 public ListNode removeElements(ListNode head, int val) {
		 if(head == null){
			 return null;
		 }
		 ListNode start = new ListNode(0);
		 start.next = head;
		 while(start.next!=null){
			if(start.next.val==val){
				if(start.next.next.next!=null){

				while(start.next.next.val==val){
					start.next.next = start.next.next.next;
				}
				start.next.val = start.next.next.val;
				start.next.next = start.next.next.next;
			}
			start.next = start.next.next;
		 }
		 return head;
	 }
}