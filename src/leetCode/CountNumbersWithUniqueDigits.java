package leetCode;

public class CountNumbersWithUniqueDigits {
	public int countNumbersWithUniqueDigits(int n) {
        int[] array = new int[n+1];
		if(n==0){
			return 1;
		}
		if(n==1){
			return 10;
		}
		array[0] = 1;
		array[1] = 9;
		int result=10;
		for(int i=2;i<=n;i++){
			array[i] = array[i-1]*(9-i+2);
			result+=array[i];
		}
		return result;
    }
}
