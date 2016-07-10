package leetCode;

public class TitleToNumber {
	 public int titleToNumber(String s) {
		  if(s.length()==0){
				 return 0;
			 }
			 if(s.length()==1){
				 return s.charAt(0)-'A'+1;
			 }
			 int count = 0;
			 int base = 1;
			 for(int i=s.length()-1;i>=0;i--){
				 if(i==s.length()-1){
					 count+=s.charAt(i)-'A'+1;
				 }else{
					 base*=26;
				     count+=base*(s.charAt(i)-'A'+1);
				 }
				 System.out.println("base"+base);
			 }
				 
			 return count;
	        
	 }
}
