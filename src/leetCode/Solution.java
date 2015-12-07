package leetCode;

public class Solution {
    public boolean isPalindrome(int x) {
    	boolean ifPalindrome;
    	if(x<0){
     		return ifPalindrome = false;
    	}
    	else{
    		int count = 1;
    		int multiNum = 1;
    		int newNum = 0;
    		int original = x;
    		while(x%10!=x){
    			count++;
    			multiNum = multiNum*10;
    			x = x/10;
    		}
    		x = original;
    		while(count>0){
    			newNum = newNum+(x%10)*multiNum;
    			x = x/10;
    			multiNum = multiNum/10;
    			count--;
    		}
    		if(newNum==original){
    			return true;
    		}else{
    			return false;
    		}
    	}
        
    }
}