package leetCode;

public class myAtoi {
	public int myAtoi(String str) {
		int num = 0;
		int maxNum = Integer.MAX_VALUE/10;
		int minNum = Integer.MIN_VALUE/10;
		boolean startFlag = false;
		boolean ifNag = false;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				if (startFlag == true) {
					return num;
				}
			} else if (startFlag == false && (str.charAt(i) == '-' || str.charAt(i) == '+')) {
				if (++i < str.length()) {
					if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
						--i;
						if (str.charAt(i) == '-') {
							ifNag = true;
						}
					} else {
						return num;
					}
				} else {
					return num;
				}
			} else if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
				if (startFlag == false) {
					startFlag = true;
				} 	
				if(ifNag){
					 if(num * 10-Integer.parseInt(str.charAt(i) + "")<=Integer.MIN_VALUE/10){
					    	return Integer.MIN_VALUE;
					    }else{
					    	num = num * 10-Integer.parseInt(str.charAt(i) + "");
					    }	
				}else{
					 if(num * 10+Integer.parseInt(str.charAt(i) + "")>=Integer.MAX_VALUE/10){
					    	return Integer.MAX_VALUE;
					    }else{
					    	num = num * 10+Integer.parseInt(str.charAt(i) + "");
					    }
				}
			  
			} else {
				return num;
			}
		}
		if (startFlag == false) {
			return 0;
		}
		return num;

	}
}
