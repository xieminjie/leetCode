package leetCode;

public class VersionControl {
	 public int firstBadVersion(int n) {
	        int left = 1, right = n;
	        while(left<right){
	            int mid = left+(right-left)/2;
	            if(isBadVersion(mid)){
	                if(isBadVersion(mid-1)){
	                    right = mid-1;
	                }else{
	                    return mid;
	                }
	            }else{
	                left = mid+1;
	            }
	            
	        }
	        return right;
	    }
}
