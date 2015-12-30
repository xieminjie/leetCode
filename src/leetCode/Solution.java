package leetCode;

public class Solution {
	public int removeElement(int[] nums, int val) {
		    int pointer = nums.length-1;
	        int i = 0;
	        if(nums.length==0){
	        	return 0;
	        }
	        if(nums.length==1){
	        	if(nums[0]==val){
	        		nums = null;
	        		return 0;
	        	}else
	        		return 1;
	        }
	        if(nums.length==2){
	        	if(nums[0]==val||nums[1]==val){
	        		if(nums[0]!=val&&nums[1]!=val){
	        			return 2;
	        		}else if(nums[0]==val&&nums[1]!=val){
	        			nums[0]=nums[1];
	        			return 1;
	        		}else{
	        			nums = null;
	        			return 0;
	        		}
	        	}else{
	        		return 2;
	        	}
	        }
	        while(i<pointer){
	        	if(nums[i]!=val){
	        		i++;
	        		System.out.println("ii "+i);
	        	}
	        	if(nums[pointer]==val){
	        		pointer--;
	        		if(pointer==0){
	        			nums = null;
	        			return 0;
	        		}
	        		System.out.println("pp "+pointer);
	        	}
	        	if(i==pointer){
	        		return i+1;
	        	}
	        	nums[i]=nums[pointer];
	        	i++;
	        	pointer--;
	        	System.out.println("i: "+i+"pointer: "+pointer);
	        }
	        return i+1;
    }
}