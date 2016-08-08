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
import java.util.Stack;

public class Solution {
	public int countNumbersWithUniqueDigits(int n) {
		int[] array = new int[n+1];
		if(n==0){
			return 1;
		}
		if(n==1){
			return 10;
		}
		array[0] = 1;
		array[1] = 9;
		int result=10;
		for(int i=2;i<=n;i++){
			array[i] = array[i-1]*(9-n+2);
			result+=array[i];
		}
		return result;
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