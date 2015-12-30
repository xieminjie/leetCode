package leetCode;

public class RemoveElement {
	public int removeElement(int[] nums, int val) {
	    int pointer = nums.length-1;
	    int count=0;
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
        while(i<pointer){
        	if(nums[i]!=val){
        		count++;
        		i++;
        	}
        	if(nums[pointer]==val){
        		pointer--;
        	}
        	if(nums[i]==val&&nums[pointer]!=val){
        		nums[i] = nums[pointer];
        		count++;
        		i++;
	        	pointer--;
        	}
        	System.out.println("i: "+i);
        	System.out.println("p: "+pointer);
        }
        return count;
}
}
