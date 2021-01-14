package Year2021.January;

import java.util.Arrays;

public class Permutation {

    char[] chars = {'a','b','c'};

    public void permutation(int length) {
        if (length == chars.length - 1) {
            System.out.println(Arrays.toString(chars));
            return;
        }
        for (int i = length; i < chars.length; i++) {
            swap(i,length);
            permutation(length + 1);
            swap(i,length);
        }
    }

    public void swap(int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }

    public static void main(String[] args) {

        new Permutation().permutation(0);
    }
}
