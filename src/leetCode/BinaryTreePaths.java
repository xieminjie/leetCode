package leetCode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {
	 public List<String> binaryTreePaths(TreeNode root) {
	        List<String> list = new ArrayList<String>();
	        if(root == null){
	            return list;
	        }
	        searchBT(root,"",list);
	        return list;
	    }
	    public void searchBT(TreeNode root,String path,List<String> list){
	        if(root.left==null&&root.right==null){
	            list.add(path+root.val);
	        }
	        if(root.right!=null){
	            searchBT(root.right,path+root.val+"->",list);
	        }
	        if(root.left!=null){
	            searchBT(root.left,path+root.val+"->",list);
	        }
	    }
}
