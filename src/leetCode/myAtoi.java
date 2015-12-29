package leetCode;

public class myAtoi {
	public int myAtoi(String str) {
		int num = 0;
		int i = 0;
		int flag = 1;
		if(str.length()==0){
			return 0;
		}
		while(i<str.length() && str.charAt(i)==' '){
			 i++;
		}
		if(i<str.length()&&str.charAt(i)=='-'||str.charAt(i)=='+'){
			if(str.charAt(i)=='-'){
				flag = -1;
			}
			i++;
		}
		while(i<str.length()&&str.charAt(i)>='0'&&str.charAt(i)<='9'){
			if(num>Integer.MAX_VALUE/10||(num==Integer.MAX_VALUE/10 && str.charAt(i)-'0'>Integer.MAX_VALUE%10)){
				if(flag==-1){
					return Integer.MIN_VALUE;
				}else
					return Integer.MAX_VALUE;
			}
			num = 10*num+Integer.parseInt(str.charAt(i)+"");
			i++;
		}
		return num*flag;

	}
}
