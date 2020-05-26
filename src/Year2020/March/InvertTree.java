package Year2020.March;

/**
 * @author shenyvhao
 * @program Algorithm
 * @description
 * @create 2020-03-24 22
 **/


public class InvertTree {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public TreeNode invertTree(TreeNode root) {
        if (root == null){
            return null;
        }
        TreeNode newTree = new TreeNode(root.val);
        newTree.left = invertTree(root.right);
        newTree.right = invertTree(root.left);

        return newTree;
    }


}
