package leetCode;

import java.util.HashSet;

public class HappyNumber {
	public boolean isHappy(int n) {
		HashSet<Integer> hs = new HashSet<Integer>();
		if(n==1){
			return true;
		}
		if(hs.contains(n)){
			return false;
		}
		while(n!=1){
			n = getNumbersSquareSum(n);
			if(hs.contains(n)){
				return false;
			}
			hs.add(n);
		}
		return n==1?true:false;
    }
	public int getNumbersSquareSum(int n){
		int num=0;
		while(n>0){
			int count = n%10;
			num+=count*count;
			n= n/10;
		}
		return num;
	}
}
