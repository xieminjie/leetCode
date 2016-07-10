package leetCode;

import java.util.ArrayList;
import java.util.HashMap;

public class majorityElement1 {
	public int majorityElement1(int[] nums) {
		 HashMap<Integer,Integer> hmap = new HashMap<Integer,Integer>();
		 int majorityElement = 0;
		 if(nums.length==1){
		     majorityElement = nums[0];
		 }
		 ArrayList<Integer> arrayList = new ArrayList();
		 int majority = nums.length/2+1;
		 for(int i=0;i<nums.length;i++){
			 if(hmap.containsKey(nums[i])){
				 int count = hmap.get(nums[i]);
				 if(++count==majority){
					 majorityElement = nums[i];
					 break;
				 }
				 Integer integer = new Integer(count);
				 hmap.put(nums[i], integer);
			 }else{
				 hmap.put(nums[i], 1);
			 }
		 }
	     return majorityElement;
	 }
}
