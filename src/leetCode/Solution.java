package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Solution {
	public int climbStairs(int n) {
        if(n==0){
        	return 0;
        }
        if(n==1){
        	return 1;
        }
        if(n==2){
        	return 2;
        }
        int[] dp = new int[n];
        dp[0]=0;
        dp[1]=1;
        dp[2]=2;
        for(int i=3;i<dp.length-1;i++){
        	dp[i] = dp[i-1]+dp[i-2];
        }
        return dp[n-1];
     
    }
}