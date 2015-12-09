package leetCode;

public class LongestCommonPrefix {
	public String longestCommonPrefix(String[] strs) {
		int maxCount = Integer.MAX_VALUE;
		int index = 0;
		String shortestStr = "";
		String prefix = "";
		for (int i = 0; i < strs.length; i++) {
			String str = strs[i];
			if (str.length() < maxCount) {
				maxCount = str.length();
				shortestStr = str;
			}
		}
		boolean flag = true;
		while(flag==true&& index<maxCount){
			int n=0;
			for(int j=0;j<strs.length;j++){
				if(shortestStr.charAt(index)==strs[j].charAt(index)){
					n++;
				}else{
					break;
				}
			}
			if(n==strs.length){
				index++;
			}else{
				flag = false;
			}
		}
		if(shortestStr.length()>0){
			prefix = shortestStr.substring(0,index);
		}
		return prefix;
	}
}
