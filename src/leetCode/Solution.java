package leetCode;

import java.util.Stack;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
    	if(s.length()==0){
    		return 0;
    	}else{
    		int maxLength = 0;
    		int index = 0;
    		Stack stack = new Stack();
    		for(int i=0;i<s.length();i++){
    			stack.clear();
        		index = 0;
        	//	System.out.println(i);
    			while(i+index<s.length()&&stack.contains(s.charAt(index)+"")==false){
        			stack.push(s.charAt(index)+"");
        			index++;
        		}
    			System.out.println(stack.size());
    			if(maxLength<stack.size()){
    				maxLength = stack.size();
    			}
    		}
    	    return maxLength;
    	}
    }
}