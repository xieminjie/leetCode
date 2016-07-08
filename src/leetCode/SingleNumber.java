package leetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class SingleNumber {
	public int[] singleNumber(int[] nums) {
        if(nums.length==0){
        	return null;
        }
        if(nums.length==1){
        	return nums;
        }
        HashMap<Integer,Integer> hs  = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
        	if(hs.containsKey(nums[i])){
        		int c = hs.get(nums[i]);
        		hs.put(nums[i], ++c);
        	}else{
        		hs.put(nums[i], 1);
        	}
        }
        ArrayList<Integer> arrayList = new ArrayList();
        Iterator it = hs.entrySet().iterator();
        while(it.hasNext()){
        	Map.Entry pair = (Entry) it.next();
        	if(pair.getValue().equals(2)){
        		arrayList.add(Integer.parseInt(pair.getKey().toString()));
        	}
        	it.remove();
        }
        int[] numArray = new int[arrayList.size()];
        for(int i=0;i<numArray.length;i++){
        	numArray[i] = arrayList.get(i);
        }
        return numArray;
    }
}
