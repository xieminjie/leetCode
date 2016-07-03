package leetCode;

public class ReverseString {
	public String reverseString(String s) {
    	String str;
    	char[] charArray = new char[s.length()];
    	int i = 0;
    	int j = s.length()-1;
    	charArray = s.toCharArray();
    	if(s==null||s.length()==1){
    		return s;
    	}
    	while(i<j){
    		char swap = charArray[i];
    		charArray[j] = charArray[i];
    		charArray[i] = swap;
    		i++;
    		j--;
    	}
    	str = new String(charArray);
        return str;
    }
}
