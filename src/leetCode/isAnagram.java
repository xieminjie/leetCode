package leetCode;

import java.util.HashMap;

public class isAnagram {
	public boolean isAnagram(String s, String t) {
		HashMap<Character,Integer> hmaps = new HashMap<Character,Integer>();
		HashMap<Character,Integer> hmapt = new HashMap<Character,Integer>();
		if(s.length()!=t.length()){
			return false;
		}
		for(int i=0;i<s.length();i++){
			if(hmaps.containsKey(s.charAt(i))){
				int count = hmaps.get(s.charAt(i));
				Integer integer = new Integer(++count);
				hmaps.put(s.charAt(i), integer);
			}else{
				hmaps.put(s.charAt(i), 1);
			}
		}
		for(int i=0;i<t.length();i++){
			if(hmapt.containsKey(t.charAt(i))){
				int count = hmapt.get(t.charAt(i));
				Integer integer = new Integer(++count);
				hmapt.put(t.charAt(i), integer);
			}else{
				hmapt.put(t.charAt(i), 1);
			}
		}
		return hmapt.equals(hmaps);
	}
}
