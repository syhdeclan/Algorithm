package Single;

import java.util.*;

/**
 * @author shenyvhao
 * @program Algorithm
 * @description
 * @create 2020-07-08 22
 **/


public class CQueue {

    Stack<Integer> stack1;
    Stack<Integer> stack2;
    public CQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void appendTail(int value) {
        stack1.push(value);
    }

    public int deleteHead() {
        if (stack2.empty()) {
            if (stack1.empty()) {
                return -1;
            }else {
                moveAllToAnother(stack1,stack2);
            }
        }
        return stack2.pop();
    }

    void moveAllToAnother(Stack<Integer> stack1, Stack<Integer> stack2){
        while (!stack1.empty()) {
             stack2.push(stack1.pop());
        }
    }

}
