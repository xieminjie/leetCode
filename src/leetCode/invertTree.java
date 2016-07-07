package leetCode;

public class invertTree {
	 public TreeNode invertTree(TreeNode root) {
	        if(root==null){
	        	return null;
	        }
	        TreeNode node = invertTree(root.left);
	        root.left = invertTree(root.right);
	        root.right = node;
	        return root;
	 }
}
