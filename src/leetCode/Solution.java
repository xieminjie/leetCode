package leetCode;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Solution {
	public int[] intersect(int[] nums1, int[] nums2) {
		 if(nums1.length==0||nums2.length==0){
	            int[] array ={};
				return array;
			}
	        HashSet<Integer> hs1 = new HashSet<Integer>();
	        for(int num:nums1){
	        	if(hs1.contains(num)==false){
	        		hs1.add(num);
	        	}
	        }
	        ArrayList<Integer> arrayList = new ArrayList();
	        for(int num: hs1){
	        	if(hs2.contains(num)){
	        		arrayList.add(num);
	        	}
	        }
	    	int[] array  = new int[arrayList.size()];
	    	for(int i=0;i<array.length;i++){
	    		array[i] = arrayList.get(i);
	    	}
	    	return array;
    }
}