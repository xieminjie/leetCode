package leetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class interSect2 {
	public int[] intersect2(int[] nums1, int[] nums2) {
		 if(nums1.length==0||nums2.length==0){
	            int[] array ={};
				return array;
		 }
		 HashMap<Integer,Integer> hs1 = new HashMap<Integer,Integer>();
		 HashMap<Integer,Integer> hs2 = new HashMap<Integer,Integer>();
		 for(int i=0;i<nums1.length;i++){
			 if(hs1.containsKey(nums1[i])){
				 int count = hs1.get(nums1[i]);
				 hs1.put(nums1[i],++count);
			 }else{
				 hs1.put(nums1[i],1);
			 }
		 }
		 for(int i=0;i<nums2.length;i++){
			 if(hs2.containsKey(nums2[i])){
				 int count = hs2.get(nums2[i]);
				 hs2.put(nums2[i],++count);
			 }else{
				 hs2.put(nums2[i],1);
			 }
		 }
		 Iterator it = hs1.entrySet().iterator();
		 ArrayList<Integer> arrayList = new ArrayList();
		 while (it.hasNext()) {
		        Map.Entry pair = (Map.Entry)it.next();
		        int key = Integer.parseInt(pair.getKey().toString());
		        int count1 =Integer.parseInt(pair.getValue().toString());
		        if(hs2.containsKey(key)){
		        	int count2 = hs2.get(key);
		        	int countMin = 0;
		        	if(count1<=count2){
		        		countMin = count1;
		        	}else{
		        		countMin = count2;
		        	}
		        	for(int i=0;i<countMin;i++){
		        		arrayList.add(key);
		        	}
		        }
		        it.remove(); // avoids a ConcurrentModificationException
		 }
		 int[] array = new int[arrayList.size()];
		 for(int i=0;i<array.length;i++){
			 array[i] = arrayList.get(i);
		 }
		 return array;
   }
}
