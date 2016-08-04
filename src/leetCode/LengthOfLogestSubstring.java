package leetCode;

import java.util.HashMap;
import java.util.Hashtable;

public class LengthOfLogestSubstring {
	public int lengthOfLongestSubstring(String s) {
		if(s.length()==0){
			return 0;
		}
		HashMap<Character,Integer> hs = new HashMap<Character,Integer>();
		int max = 0;
		for(int i=0,j=0;i<s.length();++i){
			if(hs.containsKey(s.charAt(i))){
				j = Math.max(j,hs.get(s.charAt(i))+1);
			}
			hs.put(s.charAt(i),i);
			max = Math.max(max, i-j+1);
		}
		return max;
	}
}
