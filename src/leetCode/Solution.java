package leetCode;

import java.util.ArrayList;

public class Solution {
	public void deleteNode(ListNode node) {
	       node.val = node.next.val;
	       node.next = node.next.next;
	}
}