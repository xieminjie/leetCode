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
	public List<Integer> topKFrequent(int[] nums, int k) {
		List<Integer> list = new ArrayList<Integer>();
		HashMap<Integer,Integer> hs = new HashMap();
		for(int i=0;i<nums.length;i++){
			if(list.contains(nums[i])){
				int value = hs.get(nums[i]);
				hs.put(nums[i], ++value);
			}else{
				hs.put(nums[i], 1);
			}
		}
		Iterator it = hs.entrySet().iterator();
		while(it.hasNext()){
			Map.Entry pair = (Map.Entry<K, V>)
		}
		hs.
		return list;
		
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