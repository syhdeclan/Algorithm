package Year2019.November;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class MaxDepth {
    public int maxDepth(TreeNode root) {
        int max = 0;
        if (root.left != null) {
            int a = maxDepth(root.left) + 1;
            if (a > max) {
                max = a;
            }
        }
        if (root.right != null) {
            int b = maxDepth(root.right) + 1;
            if (b > max) {
                max = b;
            }
        }
        if (root.left == null && root.right == null) {
            return 1;
        }
        return max;
    }
}
