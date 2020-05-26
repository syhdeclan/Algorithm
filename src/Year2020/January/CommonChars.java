package Year2020.January;

import java.util.LinkedList;
import java.util.List;

/**
 * @author shenyvhao
 * @program Algorithm
 * @description
 * @create 2020-01-18 20
 **/


public class CommonChars {

    public static List<String> commonChars(String[] A) {
        List list = new LinkedList();
        String a = A[0];
        char[][] arr = new char[a.length()][A.length];

        for (int i = 0; i < a.length(); i++) {
            for (int j = 0; j < A.length; j++) {
                arr[i][j] = '0';
            }
        }

        for (int i = 0; i < A.length; i++) {
            boolean b[] = new boolean[a.length()];
            b:for (int j = 0; j < a.length(); j++) {
                a:for (int k = 0; k < a.length(); k++) {
                    if (!b[i] && arr[j][i] == '0' && A[i].charAt(k) == a.charAt(j)){
                        arr[j][i] = A[i].charAt(k);
                        b[i] = true;
                    }
                }
            }
        }
        a:for (int i = 0; i < a.length(); i++) {
            for (int j = 0; j < A.length; j++) {
                if (arr[i][j] == '0'){
                    continue a;
                }
                if (j == A.length - 1){
                    list.add(a.charAt(i));
                }
            }
        }
        for (int i = 0; i < a.length(); i++) {
            for (int j = 0; j < A.length; j++) {
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
        return list;
    }

    public static void main(String[] args) {
        String[] a = {"cool","lock","cook"};
        commonChars(a);
    }

}
