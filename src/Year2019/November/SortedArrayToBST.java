package Year2019.November;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */



public class SortedArrayToBST {

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        return sortedArrayToBST(nums, 0, nums.length);
    }

    public TreeNode sortedArrayToBST(int[] nums, int start, int end){

        if (start == end){
            return null;
        }
        int mid = start + (end - start)/2;

        TreeNode root = new TreeNode(nums[mid]);
        root.left = sortedArrayToBST(nums,start,mid);
        root.right = sortedArrayToBST(nums,mid+1,end);

        return root;
    }

}
