package leetCode;

public class NimGame {
	 public boolean canWinNim(int n) {
			int remain = n%4;
			if(remain == 0){
				return false;
			}else{
				return true;
			}
	    }
}
