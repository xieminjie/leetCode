package leetCode;

import java.math.BigInteger;
import java.util.Stack;

public class ReverseInteger {
	public int reverse(int x) {
		int interger = 0;
		int mul = 1;
		boolean flag = false;
		BigInteger bigInteger = BigInteger.valueOf(x);
		String str = bigInteger.abs().toString();
		if(x<0){
			flag = true;
			System.out.println(str);
		}
	        Stack stack = new Stack();
	        System.out.println(str);
	        for(int i=0;i<str.length();i++){
	        	stack.push(str.charAt(str.length()-i-1));
	        }
	        String newStr = null;
	        while(stack.isEmpty()==false){
	            newStr = stack.pop().toString();
	            System.out.println("newStr"+newStr);
	            int newNum = Integer.parseInt(newStr);
	            System.out.println("newNum"+newNum);
	            interger = interger+newNum*mul;
	            mul = mul*10;
	        }
		
        return interger;
    }
}
