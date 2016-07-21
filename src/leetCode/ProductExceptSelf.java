package leetCode;

public class ProductExceptSelf {
	public int[] productExceptSelf(int[] nums) {
		if(nums.length==0){
			return nums;
		}
		int[] array = new int[nums.length];
		int sum = 1;
		int zeroCount = 0;
		for(int i=0;i<nums.length;i++){
			if(nums[i]==0){
				zeroCount++;
			}else{
				sum*=nums[i];
			}
		}
		for(int i=0;i<nums.length;i++){
			if(nums[i]==0){
				if(zeroCount==1){
					array[i]=sum;
				}else{
					array[i]=0;
				}
			}else{
				if(zeroCount!=0){
					array[i]=0;
				}else{
					array[i]=sum/nums[i];
				}
			}
		}
		return array;
    }	
}
