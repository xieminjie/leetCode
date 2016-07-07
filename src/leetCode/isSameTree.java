package leetCode;

public class isSameTree {
	public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null||q==null){
            if(p==null&&q==null){
                return true;
            }else{
                return false;
            }
        }else{
            if(p.val==q.val&&isSameTree(p.left,q.left)&&isSameTree(p.right,q.right)){
                return true;
            }else{
                return false;
            }
        }
    }
}
