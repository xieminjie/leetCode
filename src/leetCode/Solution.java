package leetCode;

import java.util.Hashtable;

public class Solution {
	public String longestPalindrome(String s) {
        String str = "";
        int maxPointer = 0;
        int maxLength = 0;
        char[] c = s.toCharArray();
        if(c.length==1){
        	return s;
        }
        for(int i=0;i<c.length-1;i++){
        	for(int j=c.length-1;j>0;j--){
        		int count = 0;
        		int left = i;
        		int right = j;
        		while(c[left]==c[right]&&left<right){
        			++left;
        			--right;
        			count+=2;
        			System.out.println("l "+left);
        			System.out.println("count "+count);
        		}
        		if(count>maxLength){
        			maxLength = count;
        			maxPointer = j-maxLength;
        		}
        	}
        }
        if(c.length%2==0){
        	maxLength++;
        }
       
        System.out.println("maxPointer+ "+maxPointer);
        System.out.println("maxLength+ "+maxLength);
        return s.substring(maxPointer, maxPointer+maxLength);
    }
}
