package leetCode;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Stack;

public class Solution {
	public int reverse(int x) {
		int interger = 0;
		boolean flag = x<0;
		x = Math.abs(x);
		int max_diff = Integer.MAX_VALUE/10;
		while(x>0){
			if(interger>max_diff)
				return 0;
			interger = interger*10+x%10;
			x/=10;
		}
        return flag? -1*interger:interger;
    }
}