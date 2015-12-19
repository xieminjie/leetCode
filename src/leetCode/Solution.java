package leetCode;

import java.util.Hashtable;


public class Solution { 
	 public String intToRoman(int num) {
		 StringBuilder sb = new StringBuilder();
		 while(num/1000>0){
			 sb.append('M');
			 num = num-1000;
		 }
		 
		 return sb.toString();
	 }
}
