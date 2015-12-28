package leetCode;

public class removeDuplicates {
	public int removeDuplicates(int[] nums) {
        int sameNum =0;
        int pointer = 0;
        if(nums.length==0){
        	return 0;
        }
        for(int i=0;i<nums.length;i++){
        	pointer=i+1;
        	if(nums[i]==nums[pointer]){
        		pointer++;
        		sameNum++;
        	}
        }
        return nums.length-sameNum;
    }
}
