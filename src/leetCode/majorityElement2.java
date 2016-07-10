package leetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class majorityElement2 {
	 public List<Integer> majorityElement2(int[] nums) {
		 HashMap<Integer,Integer> hmap = new HashMap<Integer,Integer>();
		 List<Integer> arrayList = new ArrayList();
		 int majority = nums.length/3+1;
		 for(int i=0;i<nums.length;i++){
			 if(hmap.containsKey(nums[i])){
				 int count = hmap.get(nums[i]);
				 hmap.put(nums[i], ++count);
			 }else{
				 hmap.put(nums[i], 1);
			 }
			 if(hmap.get(nums[i])==majority){
			     arrayList.add(nums[i]);
			 }
		 }
	     return arrayList;
	 }
}
