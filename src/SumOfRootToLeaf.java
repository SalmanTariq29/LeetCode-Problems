public class SumOfRootToLeaf {

    public int sumRootToLeaf(TreeNode root) {
        return dfs(root,0);
    }

    int dfs(TreeNode node,int currentValue){
        if(node == null) return 0;
        currentValue = currentValue * 2 + node.val;

        if (node.left == null && node.right == null){
            return currentValue;
        }
        return dfs(node.left,currentValue) + dfs(node.right,currentValue);
    }



    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val){
            this.val = val;
        }
        TreeNode(int val,TreeNode left,TreeNode right){
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
