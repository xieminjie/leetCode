package leetCode;

import java.util.Hashtable;

public class LengthOfLogestSubstring {
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
