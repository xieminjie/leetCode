package leetCode;

public class RemoveElement {
	public int removeElement(int[] nums, int val) {
        int pointer = nums.length-1;
        int i = 0;
        while(i<=pointer){
        	if(nums[i]!=val){
        		i++;
        	}
        	if(nums[pointer]==val){
        		pointer--;
        	}
        	nums[i]=nums[pointer];
        }
        return i+1;
    }
}
