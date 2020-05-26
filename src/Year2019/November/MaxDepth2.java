package Year2019.November;

import java.util.List;

class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}

public class MaxDepth2 {

    public int maxDepth(Node root){
        if (root == null){
            return 0;
        }
        if (root.children == null){
            return 1;
        }
        int max =0;
        for (int i = 0; i < root.children.size(); i++) {
            int a = maxDepth(root.children.get(i));
            if (a > max) {
                max = a;
            }
        }
        return max;
    }

}
