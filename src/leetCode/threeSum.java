package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class threeSum {
	public List<List<Integer>> threeSum(int[] nums) {
		List result = new ArrayList();
		Arrays.sort(nums);
		if(nums.length<3){
			return result;
		}
		for(int i=0;i<nums.length-2;i++){
			if(nums[i]>=0){
				return result;
			}
			for(int pointer1=i+1;pointer1<nums.length-1;pointer1++){
				for(int pointer2=i+2;pointer2<nums.length;pointer2++){
					if(pointer2<=0){
						pointer2++;
					}
					if(nums[i]+nums[pointer1]+nums[pointer2]==0){
						List r = new ArrayList();
						r.add(nums[i]);
						r.add(nums[pointer1]);
						r.add(nums[pointer2]);
						result.add(r);
					}
				}
			}
		}
		return result;
    }
}
