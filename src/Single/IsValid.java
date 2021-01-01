package Single;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author shenyvhao
 * @program Algorithm
 * @description
 * @create 2020-07-05 23
 **/


public class IsValid {

    public boolean isValid(String s) {

        char c;
        int total = 0;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            if (c == '{' || c == '[' || c == '(') {
                stack.push(c);
                total ++;
            } else {
                total --;
                if(total < 0){
                    return false;
                }
                switch (c) {
                    case ')':
                        if (stack.pop() != '(') {
                            return false;
                        }
                        break;
                    case ']':
                        if (stack.pop() != '[') {
                            return false;
                        }
                        break;
                    case '}':
                        if (stack.pop() != '{') {
                            return false;
                        }
                        break;
                    default:
                        break;
                }
            }
        }
        if(total != 0){
            return false;
        }
        return true;
    }
}
