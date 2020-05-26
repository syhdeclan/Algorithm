package Year2019.November;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        String[] strings = {"aaa","bbb"};
        System.out.println(Arrays.toString(strings).replaceAll("\\[","(").replaceAll("]",")"));
    }

}
