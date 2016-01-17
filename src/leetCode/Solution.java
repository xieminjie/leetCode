package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Solution {
	public List<List<Integer>> threeSum(int[] nums) {
		List result = new ArrayList();
		if(nums.length==0){
			return result;
		}
		Arrays.sort(nums);
		if(nums[0]>=0||nums[nums.length-1]<=0){
			return result;
		}
		HashMap map = new HashMap();
		for(int i=0;i<nums.length;i++){
			if(map.get(nums[i])==null){
				map.put(nums[i], null);
			}
		}
		for(int i=0;i<map.size()-2;i++){
			for(int pointer1 = i+1;pointer1<map.size()-1;pointer1++){
				int pointer2 = map.
				int index = map.indexOf(pointer2);
				if(index!=-1){
					List r = new ArrayList();
					r.add(newNumList.get(i));
					r.add(newNumList.get(pointer1));
					r.add(newNumList.get(index));
					result.add(r);
				}
				
			}
		}
		return result;
    }
}