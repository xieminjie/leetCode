package leetCode;

import java.util.Stack;

public class myStack {
	class MyStack {
	    Stack stack1 = new Stack();
		Stack stack2 = new Stack();
		public void push(int x) {
	        stack1.push(x);
	        while(stack1.isEmpty()==false){
	            stack2.push(stack1.pop());
	        }
	    }

	    // Removes the element on top of the stack.
	    public void pop() {
	        stack2.pop();
	    }

	    // Get the top element.
	    public int top() {
			return Integer.parseInt(stack2.peek().toString());
	        
	    }
	    // Return whether the stack is empty.
	    public boolean empty() {
			return stack2.isEmpty();
	        
	    }
	}
}
