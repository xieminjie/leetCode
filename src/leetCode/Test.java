package leetCode;


import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

public class Test {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode li1 = new ListNode(1);
		ListNode li2 = new ListNode(1);
		ListNode li3 = new ListNode(1);
		ListNode li4 = new ListNode(1);
		ListNode li5 = new ListNode(1);
		
		
		li1.next = li2;
		li2.next = li3;
		li3.next = li4;
		li4.next = li5;

		int[] nums = {2,3,4,5,6,2,3};
		Solution solution = new Solution();
		int[] n = solution.singleNumber(nums);
		for(int i=0;i<n.length;i++){
			System.out.println(n[i]);
		}
		
	}
	
}
//
//TreeNode node1 = new TreeNode(12);
//TreeNode node2 = new TreeNode(8);
//TreeNode node3 = new TreeNode(16);
//TreeNode node4 = new TreeNode(4);
//TreeNode node5 = new TreeNode(10);
//TreeNode node6 = new TreeNode(2);
//TreeNode node7 = new TreeNode(9);
//node1.left = node2;
//node1.right = node3;
//node2.left = node4;
//node2.right = node5;
//node4.left = node6;
//node5.left = node7;


/*	ListNode li1 = new ListNode(2);
ListNode li2 = new ListNode(4);
ListNode li3 = new ListNode(6);
ListNode li4 = new ListNode(10);
ListNode li5 = new ListNode(12);

ListNode li6 = new ListNode(3);
ListNode li7 = new ListNode(5);
ListNode li8 = new ListNode(9);
ListNode li9 = new ListNode(10);
li1.next = li2;
li2.next = li3;
li3.next = li4;
li4.next = li5;

li6.next = li7;
li7.next = li8;
li8.next = li9;*/