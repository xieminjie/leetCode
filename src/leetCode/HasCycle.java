package leetCode;

import java.util.HashSet;

public class HasCycle {
	 public boolean hasCycle(ListNode head) {
         if(head==null){
             return false;
         }
		 HashSet hs = new HashSet();
		 ListNode node = head;
		 while(node.next!=null){
			 if(hs.contains(node)){
				 return true;
			 }
			 hs.add(node);
			 node = node.next; 
		 }
		 return false;
		 
	 }
}
