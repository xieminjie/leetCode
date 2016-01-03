package leetCode;

import java.util.Hashtable;

public class strStr {
	public int strStr(String haystack, String needle) {
		if(needle.length()==0)
			return 0;
		int m = haystack.length();
		int n = needle.length();
		for(int i=0;i<=m-n;i++){
			String trial = haystack.substring(i,i+n);
			if(trial.equals(needle)){
				return i;
			}
		}
		return -1;
    }
}
