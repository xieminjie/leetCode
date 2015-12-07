package leetCode;

import java.util.Stack;

public class ValidParentheses {
	public boolean isValid(String s) {
        boolean ifIsValid = true;
        Stack stack = new Stack();
        char[] ch = s.toCharArray();
        for(int i=0;i<ch.length;i++){
        	if(stack.isEmpty()){
	        	stack.push(ch);	
        	}else{
        		if(ch[i]==')'){
        			if(stack.peek().equals('(')){
        				stack.pop();
        			}else{
        				ifIsValid = false;
        				break;
        			}
        		}else if(ch[i]==']'){
        			if(stack.peek().equals('[')){
        				stack.pop();
        			}else{
        				ifIsValid = false;
        				break;
        			}
        		}
        		else if(ch[i]=='}'){
        			if(stack.peek().equals('{')){
        				stack.pop();
        			}else{
        				ifIsValid = false;
        				break;
        			}
        		}else{
        			ifIsValid = false;
    				break;
        		}
        	}
        }
        if(stack.isEmpty()==false)
        	ifIsValid = false;
        return ifIsValid;
  }
}
