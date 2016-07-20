package leetCode;

import java.util.HashSet;

public class LinkedListCycle2 {
	public ListNode detectCycle(ListNode head) {
        if(head==null){
             return null;
         }
		 HashSet hs = new HashSet();
		 ListNode node = head;
		 while(node.next!=null){
			 if(hs.contains(node)){
				 return node;
			 }
			 hs.add(node);
			 node = node.next; 
		 }
		 return null;
    }
}
