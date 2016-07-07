package leetCode;

public class moveZero {
	public void moveZeroes(int[] nums) {
		int index = 0;
		int i = 0;
		if(nums.length!=0&&nums.length!=1){
			while(i<nums.length){
				if(nums[i]!=0){
					nums[index] = nums[i];
					index++;
				}
				i++;
			}
			System.out.println(index);
			while(index<nums.length){
				nums[index] = 0;
				index++;
			}
		}
    }
}
