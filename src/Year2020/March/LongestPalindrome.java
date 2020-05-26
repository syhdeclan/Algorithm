package Year2020.March;

/**
 * @author shenyvhao
 * @program Algorithm
 * @description
 * @create 2020-03-19 21
 **/


public class LongestPalindrome {

    public int longestPalindrome(String s) {
        if (s.length() == 1){
            return 1;
        }
        int sum = 0;
        int maxJi = 0;
        int[] total = new int[200];
        for (int i = 0; i < s.length(); i++) {
            int p = (int)s.charAt(i);
            total[p] ++;
        }
        for (int i = 0; i < total.length; i++) {
            sum += total[i]/2 * 2;

        }
        if(sum < s.length()){
            sum ++;
        }
        return sum;

    }

    public static void main(String[] args) {
        System.out.println(new LongestPalindrome().longestPalindrome("abccccdd"));
    }

}
