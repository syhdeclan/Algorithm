package Single;

/**
 * @author shenyvhao
 * @program Algorithm
 * @description
 * @create 2020-07-07 22
 **/


public class HasPathSum {

    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }
        // 到达叶子节点时，递归终止，判断 sum 是否符合条件。
        if (root.left == null && root.right == null) {
            return root.val == sum;
        }
        // 递归地判断root节点的左孩子和右孩子。
        return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
    }

//    作者：sweetiee
//    链接：https://leetcode-cn.com/problems/path-sum/solution/jian-dan-di-gui-bi-xu-miao-dong-by-sweetiee-2/
//    来源：力扣（LeetCode）
//    著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。

}
