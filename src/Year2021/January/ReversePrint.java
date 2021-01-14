package Year2021.January;

import java.util.Stack;

/**
 * 这道题，想的时候应该是通过将一个东西反过来需要借助栈的结构
 */
public class ReversePrint {
    public int[] reversePrint(ListNode head){
        Stack stack = new Stack();
        while (head != null) {
            stack.push(head.val);
            head = head.next;
        }
        int[] res = new int[stack.size()];
        int i = 0;
        while (stack.size() != 0){
            res[i++] = (int) stack.pop();
        }
        return res;
    }
}
