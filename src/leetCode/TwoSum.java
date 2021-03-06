package leetCode;

import java.util.Hashtable;

public class TwoSum {
	public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Hashtable<Integer,Integer> ht = new Hashtable<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
        	int rest = target-nums[i];
        	if(rest>0){
        		if(ht.containsKey(rest)){
	        		result[0] = ht.get(rest)+1;
	        		result[1] = i+1;
	        	}else{
	        		ht.put(nums[i],i);
	        	}
        	}
        }
        return result;
 }
}
