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
	// you need to treat n as an unsigned value
	public int hammingWeight(int n) {
        int count = 0;
        while(n!=0){
            count = count +(n&1);
            n = n>>>1;
        }
        return count;
    }
}