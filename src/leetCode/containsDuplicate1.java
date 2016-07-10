package leetCode;

import java.util.HashSet;

public class containsDuplicate1 {
	 public boolean containsDuplicate(int[] nums) {
	        HashSet<Integer> distinct = new HashSet<Integer>();
	        for(int num : nums) {
	            if(distinct.contains(num)) {
	                return true;
	            }
	            distinct.add(num);
	        }
	        return false;
	    }
}
