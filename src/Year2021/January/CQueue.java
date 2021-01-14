package Year2021.January;

import java.util.Stack;

public class CQueue {
    Stack stack1,stack2;
    public CQueue() {
         stack1 = new Stack();
         stack2 = new Stack();
    }

    public void appendTail(int value) {
        stack1.push(value);
    }

    public int deleteHead() {
        if (stack2.size() == 0) {
            if (stack1.size() == 0) {
                return -1;
            }
            while (stack1.size() != 0) {
                stack2.push(stack1.pop());
            }
        }
        return (int) stack2.pop();
    }
}