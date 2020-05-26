package Year2020.March;

/**
 * @author shenyvhao
 * @program Algorithm
 * @description
 * @create 2020-03-27 11
 **/


public class AliBaBa01 {

    public static void main(String[] args) {

        char[] sorted = {'d','c','b','a'};
        char[] res = {'a','b', 'c', 'd'};
        boolean isChecked[] = new boolean[res.length];
        int count = 0;
        int pos = 0;
        a:
        for (int i = 0; i < sorted.length; i++) {
            if (i > 0) {
                pos = findIndex(res,sorted[i - 1],isChecked) == -1 ? pos + 1 : findIndex(res,sorted[i - 1],isChecked);
            }
            for (int j = pos; j < res.length; j++) {
                if (sorted[i] == res[j] && isChecked[j] == false) {
                    count++;
                    isChecked[j] = true;
                    continue a;
                }
            }
        }

        System.out.println(sorted.length - count);
    }

    public static int findIndex(char[] arr, char c, boolean[] isChecked){
        int r = -1;
        for (int i = 0; i < arr.length; i++) {
            if (c == arr[i] && isChecked[i]){
                r = i;
                break;
            }
        }
        return r;
    }

}
