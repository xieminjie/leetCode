package leetCode;

public class HammingWeight {
	public int hammingWeight(int n) {
        int count = 0;
        while(n!=0){
            count = count +(n&1);
            n = n>>>1; //shift 1 position
        }
        return count;
    }
}
