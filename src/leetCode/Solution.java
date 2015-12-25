package leetCode;

import java.util.Hashtable;

public class Solution {
	public String longestPalindrome(String s) {
       // String str = "";
        int maxPointer = 0;
        int maxLength = 0;
        char[] c = s.toCharArray();
        if(c.length==1){
        	return s;
        }
        for(int i=0;i<c.length-1;i++){
        	for(int j=c.length-1;j>0;j--){
        		int length = 0;
        		int left = i;
        		int right = j;
        		while(left<right&&c[left]==c[right]){
        			System.out.println("left "+left);
        			System.out.println("right "+right);
            		if(left>=right){
            			length = j-i+1;
            			System.out.println("length "+length);
            		}
            		if(length>maxLength){
            			maxLength = length;
            			maxPointer = i;
            		}
        			++left;
        			--right;
        			if(right-left+1<=maxLength){
       				 return s.substring(maxPointer, maxPointer+maxLength);
       				}
        		}
        	}
        }
        return s.substring(maxPointer, maxPointer+maxLength);
    }
}
