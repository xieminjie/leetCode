package leetCode;

public class Pathsum2 {
	public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> path = new ArrayList<Integer>();
        if(root==null){
            return result;
        }
        DFS(root,result,path,sum);
        return result;
    }
    public void DFS(TreeNode root,List<List<Integer>> result,List<Integer> path,int sum){
        path.add(root.val);
        if(root.left==null&&root.right==null){
            if(sum==root.val){
                result.add(new ArrayList<Integer>(path));
            }
        }
        if(root.left!=null){
            DFS(root.left,result,path,sum-root.val);
        }
        if(root.right!=null){
            DFS(root.right,result,path,sum-root.val);
        }
        path.remove(path.size()-1);
    }
}
