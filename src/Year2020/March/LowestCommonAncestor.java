package Year2020.March;

import java.util.LinkedList;
import java.util.List;

/**
 * @author shenyvhao
 * @program Algorithm
 * @description
 * @create 2020-03-25 10
 **/


public class LowestCommonAncestor {


    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        List<TreeNode> pList = new LinkedList();
        List<TreeNode> qList = new LinkedList();
        this.findAncestor(root, pList, p);
        this.findAncestor(root, qList, q);
        System.out.println("Plist");
        for (int i = 0; i < pList.size(); i++) {
            System.out.println(pList.get(i).val);
        }
        System.out.println("Qlist");
        for (int i = 0; i < qList.size(); i++) {
            System.out.println(qList.get(i).val);
        }
        for (int i = 0; i < pList.size(); i++) {
            for (int j = 0; j < qList.size(); j++) {
                if (pList.get(i) == qList.get(j)) {
                    return pList.get(i);
                }
            }
        }
        return null;
    }

    public boolean findAncestor(TreeNode root, List list, TreeNode node) {
        if (root == null) {
            return false;
        }
        if (findAncestor(root.left, list, node) || findAncestor(root.right, list, node)) {
            list.add(root);
            return true;
        }
        if (root == node) {
            list.add(root);
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        TreeNode a = new TreeNode(3);
        a.left = new TreeNode(5);
        a.left.left = new TreeNode(6);
        a.right = new TreeNode(1);
        a.right.left = new TreeNode(0);
        a.right.right = new TreeNode(8);
        a.left.right = new TreeNode(2);
        a.left.right.left = new TreeNode(7);
        a.left.right.right = new TreeNode(4);

        new LowestCommonAncestor().lowestCommonAncestor(a,a.left,a.left.right.right);
    }

}
