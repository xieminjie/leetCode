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
	 public List<List<Integer>> pathSum(TreeNode root, int sum) {
	        List<List<Integer>> result = new ArrayList<List<Integer>>();
	        List<Integer> path = new ArrayList<Integer>();
	        if(root==null){
	            return result;
	        }
	        BTSearch(root,result,path,0,sum);
			return result;
	    }
	    public void BTSearch(TreeNode root,List<List<Integer>> result,List<Integer> path,int count,int sum){
	        if(count<sum){
	            if(root.left==null&&root.right==null){
	                if(count==sum){
	                    result.add(path);
	                }
	            }
	            if(root.left!=null){
	                count+=root.val;
	                path.add(root.val);
	                BTSearch(root.left,result,path,count,sum);
	            }
	            if(root.right!=null){
	                count+=root.val;
	                path.add(root.val);
	                BTSearch(root.right,result,path,count,sum);
	            }
	        }
	    }
}
//Iterator it = hs1.entrySet().iterator();
//ArrayList<Integer> arrayList = new ArrayList();
//while (it.hasNext()) {
//       Map.Entry pair = (Map.Entry)it.next();
//       int key = Integer.parseInt(pair.getKey().toString());
//       int count1 =Integer.parseInt(pair.getValue().toString());
//       if(hs2.containsKey(key)){
//       	int count2 = hs2.get(key);
//       	int countMin = 0;
//       	if(count1<=count2){
//       		countMin = count1;
//       	}else{
//       		countMin = count2;
//       	}
//       	for(int i=0;i<countMin;i++){
//       		arrayList.add(key);
//       	}
//       }
//       it.remove(); // avoids a ConcurrentModificationException
//}