package leetCode;

public class removeDuplicates {
	public int removeDuplicates(int[] nums) {
        int pointer=1;
        int i = 0;
        boolean flag = false;
        if(nums.length==0){
        	return 0;
        }
        while(pointer<nums.length){
        	if(nums[i]<nums[pointer]){
        		if(flag==true){
        			nums[++i] = nums[pointer];
        			flag = false;
        		}else{
        			i++;
            		pointer++;
        		}
        	}else{
        		if(flag == false){
    				flag = true;
    			}
    			pointer++;
        	}
        }
        
        return i+1;
    }
}
