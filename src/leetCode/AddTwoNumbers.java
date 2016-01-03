package leetCode;

public class AddTwoNumbers {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		 ListNode start = new ListNode(0);
		 ListNode pointer = start;
		 Boolean flag = false;
		 int sum = 0;
		 if(l1==null){
			 return l2;
		 }
		 if(l2==null){
			 return l1;
		 }
		 if(l1==null&&l2==null){
			 return null;
		 }
		 while(l1!=null&&l2!=null){
			 if(flag){
				 sum = l1.val+l2.val+1;
				 flag = false;
			 }else{
				 sum = l1.val+l2.val;
			 }
			 if(sum>=10){
				 sum = sum%10;
				 flag = true;
			 }
			 ListNode node = new ListNode(sum);
			 pointer.next = node;
			 l1 = l1.next;
			 l2 = l2.next;
			 pointer = pointer.next;
		 }
		 while(l1!=null&&l2==null){
			 if(flag){
				 sum = l1.val+1;
				 flag = false;
			 }else{
				 sum = l1.val;
			 }
			 if(sum>=10){
				 sum = sum%10;
				 flag = true;
			 }
			 ListNode node = new ListNode(sum);
			 pointer.next = node;
			 l1 = l1.next;
			 pointer = pointer.next;
		 }
		 while(l2!=null&&l1==null){
			 if(flag){
				 sum = l2.val+1;
				 flag = false;
			 }else{
				 sum = l2.val;
			 }
			 if(sum>=10){
				 sum = sum%10;
				 flag = true;
			 }
			 ListNode node = new ListNode(sum);
			 pointer.next = node;
			 l2 = l2.next;
			 pointer = pointer.next;
		 }
		 if(flag){
			 ListNode node = new ListNode(1);
			 pointer.next = node;
			 pointer = pointer.next;
		 }
		 return start.next;    
	 }
}
