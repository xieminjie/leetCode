package leetCode;

public class RomanToInteger {
	 public int romanToInt(String s) {
		 int number = 0;
		 int i = 0;
		 int v = 0;
		 int x = 0;
		 int l = 0;
		 int c = 0;
		 int d = 0;
		 int m = 0;
		 char[] numberArray = s.toCharArray();
		 for(int count=0;count<numberArray.length;count++){
			 if(numberArray[count]=='I'){
				 i++;
			 }else if(numberArray[count]=='V'){
				 v++;
			 }else if(numberArray[count]=='X'){
				 x++;
			 }else if(numberArray[count]=='L'){
				 l++;
		     }else if(numberArray[count]=='C'){
				 c++;
		     }else if(numberArray[count]=='D'){
				 d++;
		     }else if(numberArray[count]=='M'){
				 m++;
		     }else{
		    	 System.err.println("error");
		     }
		 }
		 System.out.println(i);
		 System.out.println(v);
		 System.out.println(x);
		 System.out.println(l);
		 System.out.println(c);
		 System.out.println(d);
		 System.out.println(m);
		 number = 1*i+5*v+x*10+l*50+c*100+d*500+m*1000;
		 return number;	        
	 }
}
