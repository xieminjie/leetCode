package leetCode;

import java.util.Hashtable;

/*Given a string, find the length of the longest substring 
 * without repeating characters. For example, the longest 
 * substring without repeating letters for "abcabcbb" is 
 * "abc", which the length is 3. For "bbbbb" the longest 
 * substring is "b", with the length of 1.*/
/*dvdf*/
public class Solution { 
	public int lengthOfLongestSubstring(String s) {
		int maxLength = 0;
		if(s.length()==0){
			return 0;
		}
		Hashtable<Character, Integer> map = new Hashtable<Character, Integer>();
		int length = 0;
		int i = 0;
		int pointer = 0;
		while(i<s.length()){
			if(map.containsKey(s.charAt(i))==true){
				length = i-pointer;
				pointer=i;
				if(length>maxLength){
					maxLength = length;
				}
			}else{
				map.put(s.charAt(i),i);
			}
			i++;
		}
		length = i-pointer;
		if(length>maxLength){
				maxLength = length;
		}
		return maxLength;
	}
}