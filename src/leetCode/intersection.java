package leetCode;

import java.util.ArrayList;

public class intersection {
	 public int[] intersection(int[] nums1, int[] nums2) {
		 ArrayList<Integer> arrayList  = new ArrayList();
		 if(nums1.length==0||nums2.length==0){
			 int[] num = {};
			 return num;
		 }
		 for(int i=0;i<nums1.length;i++){
			 for(int j=0;j<nums2.length;j++){
				 if(nums2[j]==nums1[i]){
					 if(arrayList.indexOf(nums2[j])==-1){
						 arrayList.add(nums2[j]);
					 }
				 }
			 }
		 }
		 int[] num = new int[arrayList.size()];
		 for(int i=0;i<arrayList.size();i++){
			 num[i] = arrayList.get(i);
		 }
		 return num;
	 }
}
