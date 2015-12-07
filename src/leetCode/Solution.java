package leetCode;

import java.util.Stack;

public class Solution {
	public boolean isValid(String s) {
        boolean ifIsValid = true;
        Stack stack = new Stack();
        char[] ch = s.toCharArray();
        for(int i=0;i<ch.length;i++){
        	if(stack.isEmpty()){
	        	stack.push(ch[i]);	
        	}else{
        		if(ch[i]=='('||ch[i]=='['||ch[i]=='{'){
        			stack.push(ch[i]);
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
            		}
        		}
        	}
        }
        if(stack.isEmpty()==false)
        	ifIsValid = false;
        return ifIsValid;
  }
}