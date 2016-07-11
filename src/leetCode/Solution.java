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
	 public int missingNumber(int[] nums) {
			Arrays.sort(nums);
			if(nums.length==1&&nums[0]==0){
				return 1;
			}
			if(nums[0]==1){
				return 0;
			}
	        int count = 0;
	        for(int i=0;i<nums.length;i++){
	        	if(count!=nums[i]){
	        		return count;
	        	}
	        	++count;
	        }
	        
	        return count;
	    }
}