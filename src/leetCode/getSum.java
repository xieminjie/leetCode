package leetCode;

public class getSum {
	public int getSum(int a, int b) {
        if(a==0){
        	return b;
        }
        if(b==0){
        	return a;
        }
        if(a<b){
        	int temp = a;
        	a = b;
        	b = temp;
        }
        int remain = a%b;
        int mul = a/b;
        return (mul+1)*b+remain;
    }
}
