package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Solution {
	public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        Set<Character> set = new HashSet<>();
        int ans = 0, i = 0, j = 0;
        while (i < n && j < n) {
            // try to extend the range [i, j]
            if (!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                ans = Math.max(ans, j - i);
            }
            else {
                set.remove(s.charAt(i++));
            }
        }
        return ans;
    }
}
//Iterator it = hs1.entrySet().iterator();
//ArrayList<Integer> arrayList = new ArrayList();
//while (it.hasNext()) {
//       Map.Entry pair = (Map.Entry)it.next();
//       int key = Integer.parseInt(pair.getKey().toString());
//       int count1 =Integer.parseInt(pair.getValue().toString());
//       if(hs2.containsKey(key)){
//       	int count2 = hs2.get(key);
//       	int countMin = 0;
//       	if(count1<=count2){
//       		countMin = count1;
//       	}else{
//       		countMin = count2;
//       	}
//       	for(int i=0;i<countMin;i++){
//       		arrayList.add(key);
//       	}
//       }
//       it.remove(); // avoids a ConcurrentModificationException
//}