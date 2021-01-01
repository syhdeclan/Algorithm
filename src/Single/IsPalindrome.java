package Single;

import java.util.ArrayList;
import java.util.List;

/**
 * @author shenyvhao
 * @program Algorithm
 * @description
 * @create 2020-07-07 23
 **/


public class IsPalindrome {

    public boolean isPalindrome(int x) {
        List<Integer> list = new ArrayList<>();
        while (x >= 10) {
            list.add(x % 10);
            x = x / 10;
        }
        list.add(x);
        list.stream().forEach(System.out::println);
        int len = list.size() / 2;
        for (int i = 0; i < len; i++) {
            if (list.get(i) != list.get(list.size() - i - 1)) {
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        new IsPalindrome().isPalindrome(121);
    }


}
