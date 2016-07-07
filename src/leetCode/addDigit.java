package leetCode;

public class addDigit {
	public int addDigits(int num) {
		if(num<=9){
			return num;
		}else if(num<=18&&num>=10){
			return (num%2+1);
		}else{
	        return (num%18);	
		}
    }
}
