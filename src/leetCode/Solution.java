package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Solution {
	public String countAndSay(int n) {
		String number = String.valueOf(n);
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<n;i++){
			number = convertSequence(number);
			System.out.println(number);
			sb.append(number);
			if(i<n-1){
				sb.append(',');
			}
		}
		return sb.toString();
    }
	public String convertSequence(String number){
		StringBuilder sb = new StringBuilder();
		int count=1;
		char n = number.charAt(0);
		for(int i=1;i<number.length();i++){
			if(n==number.charAt(i)){
				count++;
				if(i==number.length()-1){
					sb.append(count);
					sb.append(number.charAt(i));
				}
			}else{
				sb.append(n);
				sb.append(count);
				if(i==number.length()-1){
					sb.append(1);
					sb.append(number.charAt(i));
				}else{
					n=number.charAt(i);
					count=1;
				}
			}
		}
		return sb.toString();
	}
}