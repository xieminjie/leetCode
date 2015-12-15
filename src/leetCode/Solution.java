package leetCode;

import java.util.Hashtable;


public class Solution { 
	public int lengthOfLongestSubstring(String s) {
		int maxLength = 0;
		Hashtable<Character, Integer> map = new Hashtable<Character, Integer>();
		int length = 0;
		int i = 0;
		while(i+1<s.length()){
			if (map.containsKey(s.charAt(i)) == true) {
				length= i-Integer.valueOf(map.get(s.charAt(i)).toString());
				if(length>maxLength){
					maxLength = length;
				}
				map.clear();
				length = 0;
				i--;
			}
			map.put(s.charAt(i),i);
			i++;
			length++;
			if(length>maxLength){
				maxLength = length;
			}
		}
		return maxLength;
	}
}