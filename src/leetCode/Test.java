package leetCode;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[4];
		a[0]=2;
		a[1]=7;
		a[2]=11;
		a[3]=15;
		Solution solution = new Solution();
		int[] result = new int[2];
		result = solution.twoSum(a,9);
		System.out.println(result[0]+" "+result[1]);
	}
}
