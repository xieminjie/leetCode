package leetCode;

public class reverseVowels {
	public String reverseVowels(String s) {
        String str = null;
        char[] charArray = new char[s.length()-1];
        int i = 0;
        int j = s.length()-1;
        if(s==null||s.length()==1||s.length()==0){
        	return s;
        }
        charArray = s.toCharArray();
        while(i<j){
        	if(ifContainVowel(charArray[i])&&ifContainVowel(charArray[j])){
        		char swap = charArray[i];
        		charArray[i] = charArray[j];
        		charArray[j] = swap;
        		i++;
        		j--;
        	}
        	if(ifContainVowel(charArray[i])==false&&i<j){
        		i++;
        	}
        	if(ifContainVowel(charArray[j])==false&&i<j){
        		j--;
        	}
        }
        str = new String(charArray);
        return str;
      
    }
    public boolean ifContainVowel(char ch){
    	boolean ifContain = false;
    	char[] VowelArray = {'a','e','i','o','u','A','E','I','O','U'};
    	for(int i=0;i<VowelArray.length;i++){
    		if(ch==VowelArray[i]){
    			ifContain = true;
    		}
    	}
    	return ifContain;
    }
}
