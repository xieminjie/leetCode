package leetCode;

public class Solution {
	public int strStr(String haystack, String needle) {
        if(haystack.length()==0||needle.length()==0){
        	return -1;
        }
        for(int i=0;i<haystack.length();i++){
        	for(int j=0;j<needle.length();j++){
        		if(needle.charAt(j)==haystack.charAt(i)){
        			j++;
        			i++;
        			if(j==needle.length()){
        				return i-j;
        			}
        		}
        	}
        }
        return -1;
    }
}