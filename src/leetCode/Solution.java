package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Solution {
	public int lengthOfLastWord(String s) {
		if(s.length()==0){
			return 0;
		}
		char[] array = s.toCharArray();
    	int count = 0;
    	int lastCount = 0;
    	boolean flag = false;
        for(int i=0;i<array.length;i++){
        	if(Character.isWhitespace(array[i])){
        		if(flag){
        			lastCount = count;
        		}
        		count = 0;
        		flag = false;
        	}else{
        		count++;
        		flag = true;
        	}
        }
        return flag==true?count:lastCount;
    }
}