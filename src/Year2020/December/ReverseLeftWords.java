package Year2020.December;

/**
 * @author shenyvhao
 * @program Algorithm
 * @description
 * @create 2020-12-24 22
 **/


public class ReverseLeftWords {

    public String reverseLeftWords(String s, int n) {
        String str1 = s.substring(0,n);
        String str2 = s.substring(n);
        return str2 + str1;
    }

    public static void main(String[] args) {
        System.out.println(new ReverseLeftWords().reverseLeftWords("abcdefg",2));
    }


}
