package leetCode;

public class SearchInsertPosition {
	public int searchInsert(int[] nums, int target) {
        if(nums.length==0||nums.length==1){
        	if(target>nums[0]){
        		return 1;
        	}else{
        		return 0;
        	}
        }
        int left,right;
        int length = nums.length;
        int leftIndex = 0,rightIndex=length-1;
        int midIndex;
        left = nums[0];
        right = nums[length-1];
        while(left<right){
        	int mid = left+(left+right)/2;
        	midIndex = (leftIndex+rightIndex)/2;
        	if(mid==target){
            	if(nums[midIndex]==target){
            		return midIndex;
            	}else if(nums[midIndex]<target){
            		return ++midIndex;
            	}else{
            		return --midIndex;
            	}
        	}
        	if(mid>target){
        		right = mid-1;
        		rightIndex = midIndex;
        	}
        	if(mid<target){
        		left = mid+1;
        		leftIndex = midIndex;
        	}
        	System.out.println(left+":"+right);
        }
        return 0;
    }
}
